package com.hemebiotech.analytics;

import java.util.*;

/**
 * Count and sort the list of symptoms using a TreeMap
 */

public class CountSortSymptoms {

	private ArrayList<String> inputListSymptoms;

	/**
	 * @param ArrayList<String> : a ArrayList of Strings containing the list of symptoms not sorted and possibly with duplications
	 */	
	public CountSortSymptoms(ArrayList<String> inputListSymptoms) {
		this.inputListSymptoms = inputListSymptoms;
	}
	
	/**
	 * @return TreeMap<String, Integer> : a TreeMap of Keys / Values, sorted by Keys. Keys are Strings containing symptom names and Values are Integer containing the frequency of each symptom
	 */	
	public TreeMap<String, Integer> countSymptoms() { //OB : Mieux avec une methode Static ?

		TreeMap<String, Integer> tmCountSymptoms = new TreeMap<>();

		ListIterator<String> itListSymptoms = inputListSymptoms.listIterator(); //OB : Pas necessaire de mettre this ?

		while (itListSymptoms.hasNext()) {
			String eltListSymptoms = itListSymptoms.next();
			tmCountSymptoms.put(eltListSymptoms, (Integer) Collections.frequency(inputListSymptoms, eltListSymptoms));
		}
		return tmCountSymptoms;
	}
}
