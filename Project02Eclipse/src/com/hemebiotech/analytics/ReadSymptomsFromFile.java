package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;

/**
 * Read the input list of symptoms from a file and put them in a ArrayList
 */

public class ReadSymptomsFromFile implements ISymptomsReader {

	/**
	 * A full or partial path to file with symptom strings in it, one per line
	 */	
	private String filepathInput;

	/**
	 * @param filepathInput
	 * A full or partial path to file with symptom strings in it, one per line
	 */	
	public ReadSymptomsFromFile(String filepathInput) {
		this.filepathInput = filepathInput;
	}

	/**
	 * Return an ArrayList of Strings containing the list of symptoms not sorted and possibly with duplications
	 * 
	 * @return An ArrayList of Strings containing the list of symptoms not sorted and possibly with duplications
	 */
	@Override
	public ArrayList<String> getSymptoms() {

		ArrayList<String> inputListSymptoms = new ArrayList<String>();

		if (filepathInput != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepathInput));
				String line = reader.readLine();

				while (line != null) {
					inputListSymptoms.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return inputListSymptoms;
	}
}
