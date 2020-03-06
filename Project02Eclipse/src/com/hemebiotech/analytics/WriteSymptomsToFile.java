package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;
import java.util.Map.*;

/**
 * Write the sorted list of symptoms and their frequencies from a TreeMap to a file
 */

public class WriteSymptomsToFile {

	private String filepathOutput;
	
	/**
	 * @param filepathOutput : a full or partial path to file that should contain the result (one symptom per line and its frequency)
	 */	
	public WriteSymptomsToFile(String filepathOutput) {
		this.filepathOutput = filepathOutput;
	}
	
	/**
	 * @param TreeMap<String, Integer> : a TreeMap of Keys / Values, sorted by Keys. Keys are Strings containing symptom names and Values are Integer containing the frequency of each symptom
	 */	
	public void writeSymptoms(TreeMap<String, Integer> tmCountSymptoms) {

		Set<Entry<String, Integer>> setTm = tmCountSymptoms.entrySet();
		Iterator<Entry<String, Integer>> itMap = setTm.iterator();

		try {
			FileWriter writer = new FileWriter(filepathOutput);

			while (itMap.hasNext()) {
				Entry<String, Integer> eltMap = itMap.next();
				System.out.println(eltMap.getKey() + " : " + eltMap.getValue());

				writer.write(eltMap.getKey() + " : " + eltMap.getValue() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
