package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String[] args) {
		
		//Input file containing the list of symptoms
		String filepathInput = "C:\\Users\\olivi\\OneDrive\\Bureau\\OCR\\Projet2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt";
		
		//Output file containing the results : sorted list of symptoms with their frequencies
		String filePathOutput = "C:\\Users\\olivi\\OneDrive\\Bureau\\OCR\\Projet2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\result.out";

		//First we read the input list of symptoms from the input file and put them in a ArrayList
		ReadSymptomsFromFile readSymptomsFromFile = new ReadSymptomsFromFile(filepathInput);
		ArrayList<String> inputListSymptoms = readSymptomsFromFile.getSymptoms();
		
		//Then we count and sort the list of symptoms using a TreeMap
		CountSortSymptoms countSortSymptoms = new CountSortSymptoms(inputListSymptoms);
		TreeMap<String, Integer> tmCountSortSymptoms = countSortSymptoms.countSymptoms();
				
		//Finally we write the sorted list of symptoms and their frequencies from a TreeMap to the output file
		WriteSymptomsToFile writeSymptomsToFile = new WriteSymptomsToFile(filePathOutput);
		writeSymptomsToFile.writeSymptoms(tmCountSortSymptoms);

	}

}