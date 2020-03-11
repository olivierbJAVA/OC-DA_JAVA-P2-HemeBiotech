package com.hemebiotech.analytics;

import java.util.*;

public class AnalyticsTool {
	
	public static void main(String[] args) {

		//Input file containing the list of symptoms
		String filepathInput = "C:\\Users\\olivi\\OneDrive\\Bureau\\OCR\\Projet2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt";
		
		//Output file to write the result
		String filepathOutput = "C:\\Users\\olivi\\OneDrive\\Bureau\\OCR\\Projet2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\result.out";
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Hello and welcome to the Analytics Tool !");
		System.out.println("Please choose the type of analysis you want to perform :");
		
		//we ask the user to choose the type of analysis he wants to perform
		int analysisChoice=0;
		boolean analysisChoiceOk = false;
		
		do {
			System.out.println("-> For a Counter analysis : please type 1");
			System.out.println("-> For a Medicine analysis : please type 2");
			try {
				analysisChoice = console.nextInt();
				analysisChoiceOk=(analysisChoice==1 || analysisChoice==2);
			}
			catch (InputMismatchException e) {
				console.next();
			}
			catch (Exception e) {
				System.out.println("Error, program exit");
				System.exit(0);
			}
			if(!analysisChoiceOk) {
				System.out.println("Error, please choose again :");
			}
		}
		while (!analysisChoiceOk);
		
		console.close();
		
		//we perform a counter type analysis
		if (analysisChoice==1) {
			System.out.println("You have choosen a Counter analysis. The analysis has been performed and the result is in the result.out file.");
		
			//we create a counter type analysis by setting its strategies
			AnalysisCounter counterAnalysis = new AnalysisCounter(new ReadSymptomsFromFile(filepathInput), new PerformCounterAnalysis(), new WriteResultToFile<String,Integer>(filepathOutput));
			
			//we get the input
			ArrayList<String> inputListSymptomsCounter = counterAnalysis.getInput();
			
			//we perform the analysis
			TreeMap<String, Integer> tmResultSymptomsCounter = counterAnalysis.analyse(inputListSymptomsCounter);
			
			//we return the output
			counterAnalysis.returnOutput(tmResultSymptomsCounter);
			/*
			//we set a different output strategy
			counterAnalysis.setResultWriter(new WriteResultToConsole<String,Integer>());
			counterAnalysis.returnOutput(counterAnalysis.analyse(counterAnalysis.getInput()));
			*/
		
		//we perform a medicine type analysis
		} else if (analysisChoice==2) {
			System.out.println("You have choosen a Medicine analysis. Please find the result below :");
		
			//medicine type analysis
			AnalysisMedicine medicineAnalysis = new AnalysisMedicine(new ReadSymptomsFromFile(filepathInput), new PerformMedicineAnalysis(), new WriteResultToConsole<String,String>());

			medicineAnalysis.returnOutput(medicineAnalysis.analyse(medicineAnalysis.getInput()));
		}
	}
}
