package com.hemebiotech.analytics;

import java.util.*;

/**
 * Anything that will return result contained in a TreeMap <br/>
 * Generic Interface
 */
public interface IResultWriter<K, V> {
	/**
	 * Return the result contained in a TreeMap
	 * 
	 * @param tmResultSymptoms
	 * A TreeMap of Keys / Values, sorted by Keys.
	 */
	void writeResult (TreeMap<K, V> tmResultSymptoms);
}
