package com.hemebiotech.analytics.program;

import java.util.*;
import com.hemebiotech.analytics.util.*;

public class AnalyticsTool {

	public static void main(String[] args) {

		// Input file containing the list of symptoms
		String filepathInput = "C:\\Users\\olivi\\OneDrive\\Bureau\\OCR\\Projet2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt";

		// Output file to write the result
		String filepathOutput = "C:\\Users\\olivi\\OneDrive\\Bureau\\OCR\\Projet2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\result.out";

		// we create a counter type analysis by setting its strategies
		AnalysisCounter counterAnalysis = new AnalysisCounter(new ReadSymptomsFromFile(filepathInput),
				new PerformCounterAnalysis(), new WriteResultToFile<String, Integer>(filepathOutput));

		// we get the input
		ArrayList<String> inputListSymptomsCounter = counterAnalysis.getInput();

		// we perform the analysis
		TreeMap<String, Integer> tmResultSymptomsCounter = counterAnalysis.analyse(inputListSymptomsCounter);

		// we return the output
		counterAnalysis.returnOutput(tmResultSymptomsCounter);

	}
}
