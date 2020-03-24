package com.hemebiotech.analytics.model;

import java.io.*;
import java.util.*;

import com.hemebiotech.analytics.services.*;

public class AnalyticsTool {

	public static void main(String[] args) {

		String s = File.separator;

		// Input file containing the list of symptoms
		File filePathInput = new File("Project02Eclipse" + s + "symptoms.txt");

		if (!filePathInput.exists()) {
			System.out.println("Error : Input_File 'Symptoms.txt' not found");
			System.exit(1);
		}

		// Output file to write the result
		File filePathOutput = new File("Project02Eclipse" + s + "results.out");

		// we create a counter type analysis by setting its strategies
		AnalysisCounter counterAnalysis = new AnalysisCounter(new ReadSymptomsFromFile(filePathInput),
				new PerformCounterAnalysis(), new WriteResultToFile<String, Integer>(filePathOutput));

		// we get the input
		ArrayList<String> inputListSymptomsCounter = counterAnalysis.getInput();

		// we perform the analysis
		TreeMap<String, Integer> tmResultSymptomsCounter = counterAnalysis.analyse(inputListSymptomsCounter);

		// we return the output
		counterAnalysis.returnOutput(tmResultSymptomsCounter);

	}
}
