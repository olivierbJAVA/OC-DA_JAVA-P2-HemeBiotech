package com.hemebiotech.analytics.util;

import java.util.*;

/**
 * Anything that will return result of an analysis contained in a TreeMap <br/>
 * Generic Interface
 */
public interface IResultWriter<K, V> {
	
	/**
	 * Return the result of an analysis
	 * 
	 * @param tmResultSymptoms
	 * A TreeMap of Keys / Values, sorted by Keys.
	 */
	void writeResult (TreeMap<K, V> tmResultSymptoms);
}
