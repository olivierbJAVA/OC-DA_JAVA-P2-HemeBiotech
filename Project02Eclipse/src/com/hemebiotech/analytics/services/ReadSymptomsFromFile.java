package com.hemebiotech.analytics.services;

import java.io.*;
import java.util.*;

/**
 * Read the input list of symptoms from a file and put them in an ArrayList
 */
public class ReadSymptomsFromFile implements ISymptomsReader {

	/**
	 * A full or partial path to file with symptom strings in it, one per line
	 */	
	private File filePathInput;

	/**
	 * @param filePathInput
	 * A full or partial path to file with symptom strings in it, one per line
	 */	
	public ReadSymptomsFromFile(File filePathInput) {
		this.filePathInput = filePathInput;
	}

	/**
	 * Return the list of symptoms
	 * 
	 * @return An ArrayList of Strings containing the list of symptoms not sorted and possibly with duplications
	 */
	@Override
	public ArrayList<String> getSymptoms() {

		ArrayList<String> inputListSymptoms = new ArrayList<String>();

		if (filePathInput != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filePathInput));
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
