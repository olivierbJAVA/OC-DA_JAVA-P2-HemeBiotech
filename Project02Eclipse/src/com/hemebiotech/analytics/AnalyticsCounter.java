package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalyticsCounter {
	private static int headacheCount = 0;
	private static int rashCount = 0;
	private static int dialatedPupilsCount = 0;

	public static void main(String args[]) {

		BufferedReader reader=null;
		FileWriter writer = null;
		
		try {

			// first get and count input
			reader = new BufferedReader(new FileReader(
					"C:\\Users\\olivi\\OneDrive\\Bureau\\OCR\\Projet2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt"));
			String line = reader.readLine();

			while (line != null) {
				// System.out.println("symptom from file: " + line);
				if (line.equals("headache")) {
					headacheCount++;
					// System.out.println("number of headaches: " + headacheCount);
				} else if (line.equals("rash")) {
					rashCount++;
				} else if (line.equals("dialated pupils")) {
					dialatedPupilsCount++;
				}
				line = reader.readLine();
			}
			reader.close();

			// next generate output
			writer = new FileWriter(
					"C:\\Users\\olivi\\OneDrive\\Bureau\\OCR\\Projet2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\result.out");
			writer.write("headache: " + headacheCount + "\n");
			writer.write("rash: " + rashCount + "\n");
			writer.write("dialated pupils: " + dialatedPupilsCount + "\n");
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		finally { 
            try { 
            	if (reader!=null) 
            		reader.close(); 
            	} catch (Exception e) {
            		e.printStackTrace();
            	}
            try {
            	if (writer!=null) 
            		writer.close(); 
        		} catch (Exception e) {
        			e.printStackTrace();
        		}
		}

}

}