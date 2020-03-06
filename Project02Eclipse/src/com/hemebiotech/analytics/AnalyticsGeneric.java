package com.hemebiotech.analytics;

import java.util.ArrayList;

/** Abstract class containing generic elements of an analysis <br/>
*	To be inherited to implement concrete analysis
*/
public abstract class AnalyticsGeneric {

	/**
	 * An ArrayList of Strings containing the list of symptoms not sorted and possibly with duplications to be analyzed
	 */
	protected ArrayList<String> inputSymptoms;

	/**
	 * Method performing the analysis
	 */
	protected abstract void analyseSymptoms();
	
	/**
	 * Method generating the result of the analysis
	 */
	protected abstract void generateOutput();
}
