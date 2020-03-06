package com.hemebiotech.analytics;

import java.util.Map.*;
import java.io.*;
import java.util.*;

public class AnalyticsCounter {

	public static void main(String args[]) {

		try {

			// first get input
			BufferedReader reader = new BufferedReader(new FileReader(
					"C:\\Users\\olivi\\OneDrive\\Bureau\\OCR\\Projet2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt"));
			String line = reader.readLine();

			ArrayList<String> inputListSymptoms = new ArrayList<String>();

			while (line != null) {
				inputListSymptoms.add(line);
				line = reader.readLine();
			}
			reader.close();

			// then count and sort symptoms
			TreeMap<String, Integer> tmCountSymptoms = new TreeMap<>();

			ListIterator<String> itListSymptoms = inputListSymptoms.listIterator();
			while (itListSymptoms.hasNext()) {
				String eltListSymptoms = itListSymptoms.next();
				tmCountSymptoms.put(eltListSymptoms,
						(Integer) Collections.frequency(inputListSymptoms, eltListSymptoms));
			}

			// finally write results
			FileWriter writer = new FileWriter(
					"C:\\Users\\olivi\\OneDrive\\Bureau\\OCR\\Projet2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\result.out");

			Set<Entry<String, Integer>> setTm = tmCountSymptoms.entrySet();
			Iterator<Entry<String, Integer>> itMap = setTm.iterator();
			while (itMap.hasNext()) {
				Entry<String, Integer> eltMap = itMap.next();
				System.out.println(eltMap.getKey() + " : " + eltMap.getValue());

				writer.write(eltMap.getKey() + " : " + eltMap.getValue() + "\n");

			}
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}