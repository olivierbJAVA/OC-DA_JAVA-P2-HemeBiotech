package com.hemebiotech.analytics;

import java.util.ArrayList;

import java.util.TreeMap;

/**
 * Anything that will perform an analysis <br/>
 * Input : a List of String <br/>
 * Output : a TreeMap <br/>
 * Generic Interface
 */
public interface IAnalysisPerform<K,V> {
	
	/**
	 * Perform the analysis
	 * 
	 * @param inputListSymptoms
	 * An ArrayList of Strings containing the list of symptoms not sorted and possibly with duplications
	 * 
	 * @return A TreeMap containing the result of the analysis
	 */
	TreeMap<K,V> performAnalysis(ArrayList<String> inputListSymptoms);
}
