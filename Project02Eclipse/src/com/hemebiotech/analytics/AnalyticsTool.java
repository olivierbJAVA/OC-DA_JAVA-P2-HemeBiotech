package com.hemebiotech.analytics;

import java.util.ArrayList;

public class AnalyticsTool {
	
	public static void main(String[] args) {

		//Input file containing the list of symptoms
		String filepathInput = "C:\\Users\\olivi\\OneDrive\\Bureau\\OCR\\Projet2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt";
		
		//First we read the input list of symptoms from the input file and put them in a ArrayList
		ReadSymptomsFromFile readSymptomsFromFile = new ReadSymptomsFromFile(filepathInput);
		ArrayList<String> inputListSymptoms = readSymptomsFromFile.getSymptoms();

		//'Counter' type analysis
		AnalyticsCounter analyticsCounter = new AnalyticsCounter(inputListSymptoms);
		//we perform the analysis
		analyticsCounter.analyseSymptoms();	
		//we generate the output
		analyticsCounter.generateOutput();
		
		//'Medicine' type analysis
		AnalyticsMedicine analyticsMedicine = new AnalyticsMedicine(inputListSymptoms);
		//we perform the analysis
		analyticsMedicine.analyseSymptoms();	
		//we generate the output
		analyticsMedicine.generateOutput();

		/*
		Version avec un tableau utilisant le polymorphisme
		
		AnalyticsGeneric [] analyticsGenericTable = new AnalyticsGeneric [2];
		
		analyticsGenericTable[0] = new AnalyticsCounter(inputListSymptoms);
		analyticsGenericTable[1] = new AnalyticsMedicine(inputListSymptoms);
		
		//for each analysis :
		for (AnalyticsGeneric analyticsGeneric : analyticsGenericTable) {
			//we perform the analysis
			analyticsGeneric.analyseSymptoms();
			//we generate the output
			analyticsGeneric.generateOutput();
		}
		*/
	}

}
