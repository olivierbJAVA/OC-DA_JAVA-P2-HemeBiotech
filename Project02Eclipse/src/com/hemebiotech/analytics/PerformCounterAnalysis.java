package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Counter type analysis Strategy
 */

public class PerformCounterAnalysis implements IAnalysisPerform<String, Integer> {
	
	/**
	 * Performing a counter type analysis
	 * 
	 * @param inputListSymptoms
	 * An ArrayList of Strings containing the list of symptoms not sorted and possibly with duplications
	 * 
	 * @return A TreeMap containing the result of the analysis
	 */
	@Override
	public TreeMap<String, Integer> performAnalysis(ArrayList<String> inputListSymptoms){

		TreeMap<String, Integer> tmCountSymptoms = new TreeMap<String, Integer>();
		
		for(String eltListSymptoms:inputListSymptoms) {
			if(!tmCountSymptoms.containsKey(eltListSymptoms)){
				tmCountSymptoms.put(eltListSymptoms,1);
			}
			else {
				tmCountSymptoms.replace(eltListSymptoms, tmCountSymptoms.get(eltListSymptoms)+1);
			}
		}
		return tmCountSymptoms;
	}
}

