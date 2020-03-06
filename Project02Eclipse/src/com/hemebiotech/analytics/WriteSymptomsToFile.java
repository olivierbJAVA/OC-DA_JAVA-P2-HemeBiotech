package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;
import java.util.Map.*;

/**
 * Write the result of an analysis contained in a TreeMap to a file <br>
 * Generic class
 */

public class WriteSymptomsToFile<K, V> {

	/**
	 * A full or partial path to file that should contain the analysis result
	 */	
	private String filepathOutput;

	/**
	 * @param filepathOutput
	 * A full or partial path to file that should contain the analysis result
	 */	
	public WriteSymptomsToFile(String filepathOutput) {
		this.filepathOutput = filepathOutput;
	}

	/**
	 * Method writing the results contained in a TreeMap to a file
	 * 
	 * @param tmResultSymptoms
	 * A TreeMap of Keys / Values, sorted by Keys.
	 */
	public void writeSymptoms(TreeMap<K, V> tmResultSymptoms) {

		Set<Entry<K, V>> setTm = tmResultSymptoms.entrySet();
		Iterator<Entry<K, V>> itMap = setTm.iterator();

		try {
			FileWriter writer = new FileWriter(filepathOutput);

			//for(Set<Entry<K, V>> eltMap:tmResultSymptoms){}
			while (itMap.hasNext()) {
				Entry<K, V> eltMap = itMap.next();
				System.out.println(eltMap.getKey() + " : " + eltMap.getValue());

				writer.write(eltMap.getKey() + " : " + eltMap.getValue() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

