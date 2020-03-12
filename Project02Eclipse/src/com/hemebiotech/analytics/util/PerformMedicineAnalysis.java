package com.hemebiotech.analytics.util;

import java.util.*;

/**
 * Medicine type analysis Strategy
 */

public class PerformMedicineAnalysis implements IAnalysisPerform<String, String> {
	
	/**
	 * Perform a medicine type analysis
	 * 
	 * @param inputListSymptoms
	 * An ArrayList of Strings containing the list of symptoms not sorted and possibly with duplications
	 * 
	 * @return A TreeMap containing the result of the analysis
	 */
	@Override
	public TreeMap<String, String> performAnalysis(ArrayList<String> inputListSymptoms){

		TreeMap<String, String>tmMedicineSymptoms = new TreeMap<String, String>();

		for(String eltListSymptoms:inputListSymptoms) {
			tmMedicineSymptoms.put(eltListSymptoms,"Medicine_" + eltListSymptoms);
		}
		
		return tmMedicineSymptoms;
	}
}
