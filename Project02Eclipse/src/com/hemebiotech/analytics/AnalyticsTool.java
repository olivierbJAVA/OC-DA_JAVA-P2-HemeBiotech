package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

public class AnalyticsTool {
	
	public static void main(String[] args) {

		//Input file containing the list of symptoms
		String filepathInput = "C:\\Users\\olivi\\OneDrive\\Bureau\\OCR\\Projet2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt";
		
		//Output file to write the result
		String filepathOutput = "C:\\Users\\olivi\\OneDrive\\Bureau\\OCR\\Projet2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\result.out";
		
		//we create a counter type analysis by setting its strategies
		AnalysisCounter counterAnalysis = new AnalysisCounter(new ReadSymptomsFromFile(filepathInput), new PerformCounterAnalysis(), new WriteResultToFile(filepathOutput));
		
		//we get the input
		ArrayList<String> inputListSymptomsCounter = counterAnalysis.getInput();
		
		//we perform the analysis
		TreeMap<String, Integer> tmResultSymptomsCounter = counterAnalysis.analyse(inputListSymptomsCounter);
		
		//we return the output
		counterAnalysis.returnOutput(tmResultSymptomsCounter);
		
		//we set a different output strategy
		counterAnalysis.setResultWriter(new WriteResultToConsole());
		counterAnalysis.returnOutput(counterAnalysis.analyse(counterAnalysis.getInput()));
		
		//medicine type analysis
		AnalysisMedicine medicineAnalysis = new AnalysisMedicine(new ReadSymptomsFromFile(filepathInput), new PerformMedicineAnalysis(), new WriteResultToConsole());

		medicineAnalysis.returnOutput(medicineAnalysis.analyse(medicineAnalysis.getInput()));
	}

}
