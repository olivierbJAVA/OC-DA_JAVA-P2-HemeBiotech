package com.hemebiotech.analytics;

import java.util.*;

/** 
*	Class to be used to perform a 'counter' type analysis
*/
public class AnalyticsCounter extends AnalyticsGeneric {

	/**
	 * @param inputSymptoms
	 * An ArrayList of Strings containing the list of symptoms not sorted and possibly with duplications
	 */
	public AnalyticsCounter(ArrayList<String> inputSymptoms) {

		this.inputSymptoms = inputSymptoms;
	}

	/**
	 * A TreeMap containing the result of the analysis : symptoms counted and sorted
	 */
	private TreeMap<String, Integer> tmCountSymptoms;

	/**
	 * Perform the 'counter' type analysis
	 */	
	public void analyseSymptoms() {

		tmCountSymptoms = new TreeMap<>();
		
		for(String eltListSymptoms:inputSymptoms) {
			if(!tmCountSymptoms.containsKey(eltListSymptoms)){
				tmCountSymptoms.put(eltListSymptoms,1);
			}
			else {
				tmCountSymptoms.replace(eltListSymptoms, tmCountSymptoms.get(eltListSymptoms)+1);
			}
		}
	}

	/**
	 * Generate the output of the 'counter' type analysis
	 */
	public void generateOutput() {

		//output file path
		String filepathOutput = "C:\\Users\\olivi\\OneDrive\\Bureau\\OCR\\Projet2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\results_CounterAnalysis.out";

		WriteSymptomsToFile<String, Integer> writeSymptomsToFile = new WriteSymptomsToFile<String, Integer>(
				filepathOutput);

		writeSymptomsToFile.writeSymptoms(tmCountSymptoms);
	}
}
