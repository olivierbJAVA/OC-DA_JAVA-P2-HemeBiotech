package com.hemebiotech.analytics;

import java.util.*;
import java.util.Map.*;

/**
 * Write the result of an analysis contained in a TreeMap to the console <br/>
 * Generic class
 */

public class WriteResultToConsole<K, V> implements IResultWriter<K, V> {

	/**
	 * Write the results contained in a TreeMap to the console
	 * 
	 * @param tmResultSymptoms 
	 * A TreeMap of Keys / Values, sorted by Keys.
	 */
	@Override
	public void writeResult(TreeMap<K, V> tmResultSymptoms) {

		Set<Entry<K, V>> setTm = tmResultSymptoms.entrySet();
		Iterator<Entry<K, V>> itMap = setTm.iterator();

		while (itMap.hasNext()) {
			Entry<K, V> eltMap = itMap.next();
			System.out.println(eltMap.getKey() + " : " + eltMap.getValue());
		}

	}
}
