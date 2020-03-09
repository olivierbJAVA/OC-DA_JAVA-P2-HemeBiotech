package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;
import java.util.Map.*;

/**
 * Write the result of an analysis contained in a TreeMap to a file <br/>
 * Generic class
 */

public class WriteResultToFile<K, V> implements IResultWriter<K, V>  {

	/**
	 * A full or partial path to file that should contain the analysis result
	 */	
	private String filepathOutput;

	/**
	 * @param filepathOutput
	 * A full or partial path to file that should contain the analysis result
	 */	
	public WriteResultToFile(String filepathOutput) {
		this.filepathOutput = filepathOutput;
	}

	/**
	 * Write the results contained in a TreeMap to a file
	 * 
	 * @param tmResultSymptoms
	 * A TreeMap of Keys / Values, sorted by Keys.
	 */
	@Override
	public void writeResult(TreeMap<K, V> tmResultSymptoms) {

		Set<Entry<K, V>> setTm = tmResultSymptoms.entrySet();
		Iterator<Entry<K, V>> itMap = setTm.iterator();

		try {
			FileWriter writer = new FileWriter(filepathOutput);

			while (itMap.hasNext()) {
				Entry<K, V> eltMap = itMap.next();
				writer.write(eltMap.getKey() + " : " + eltMap.getValue() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

