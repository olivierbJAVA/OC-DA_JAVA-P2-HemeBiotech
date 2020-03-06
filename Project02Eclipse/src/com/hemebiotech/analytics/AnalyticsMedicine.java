package com.hemebiotech.analytics;

import java.util.*;

/** 
*	Class to be used to perform a 'medicine' type analysis
*/
public class AnalyticsMedicine extends AnalyticsGeneric {

	/**
	 * @param inputSymptoms
	 * An ArrayList of Strings containing the list of symptoms not sorted and possibly with duplications
	 */
	public AnalyticsMedicine(ArrayList<String> inputSymptoms) {

		this.inputSymptoms = inputSymptoms;
	}
	
	/**
	 * A TreeMap containing the result of the analysis : sorted symptoms with the corresponding medicine
	 */
	private TreeMap<String, String> tmMedicineSymptoms;

	/**
	 * Perform the 'medicine' type analysis
	 */
	public void analyseSymptoms() {

		tmMedicineSymptoms = new TreeMap<>();

		for(String eltListSymptoms:inputSymptoms) {
			tmMedicineSymptoms.put(eltListSymptoms,"Medicine_" + eltListSymptoms);
		}
	}

	/**
	 * Generate the output of the 'medicine' type analysis
	 */
	public void generateOutput() {

		//output file path
		String filepathOutput = "C:\\Users\\olivi\\OneDrive\\Bureau\\OCR\\Projet2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\results_MedicineAnalysis.out";

		WriteSymptomsToFile<String, String> writeSymptomsToFile = new WriteSymptomsToFile<String, String>(
				filepathOutput);

		writeSymptomsToFile.writeSymptoms(tmMedicineSymptoms);
	}

}
