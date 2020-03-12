package com.hemebiotech.analytics.util;

import java.util.*;

/**
 * Write the result of an analysis contained in a TreeMap to the console <br/>
 * Generic class
 */

public class WriteResultToConsole<K, V> implements IResultWriter<K, V> {

	/**
	 * Write the results of an analysis to the console
	 * 
	 * @param tmResultSymptoms 
	 * A TreeMap of Keys / Values, sorted by Keys.
	 */
	@Override
	public void writeResult(TreeMap<K, V> tmResultSymptoms) {

		for (Map.Entry<K,V> mapentry : tmResultSymptoms.entrySet()) {
			System.out.println(mapentry.getKey() + " : " + mapentry.getValue());
		}
	}
}
