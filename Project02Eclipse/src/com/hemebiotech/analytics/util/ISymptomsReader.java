package com.hemebiotech.analytics.util;

import java.util.*;

/**
 * Anything that will read symptom data from a source <br/>
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomsReader {
	
	/**
	 * Get the input
	 * 
	 * @return An ArrayList containing all symptoms obtained from a data source, duplicates are possible/probable
	 */
	ArrayList<String> getSymptoms ();
}
