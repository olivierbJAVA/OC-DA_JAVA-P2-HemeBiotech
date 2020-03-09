package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

/** Abstract class containing generic elements of an analysis <br/>
*	To be inherited to implement concrete analysis
*/
public abstract class Analysis<K,V> {
		
	protected ISymptomsReader symptomsReader; //= new ReadSymptomsFromFile();
	protected IAnalysisPerform<K,V> analysisPerform;
	protected IResultWriter<K,V> resultWriter;
	
	public Analysis(ISymptomsReader symptomsReader, IAnalysisPerform<K,V> analysisPerform, IResultWriter<K,V> resultWriter) {
		this.symptomsReader=symptomsReader;
		this.analysisPerform=analysisPerform;
		this.resultWriter=resultWriter;
	}
	
	/**
	 * Return an ArrayList of Strings containing the list of symptoms not sorted and possibly with duplications
	 * 
	 * @return An ArrayList of Strings containing the list of symptoms not sorted and possibly with duplications
	 */
	public ArrayList<String> getInput() {
		return symptomsReader.getSymptoms();
	}
	
	/**
	 * Perform the analysis
	 * 
	 * @param inputListSymptoms
	 * An ArrayList of Strings containing the list of symptoms not sorted and possibly with duplications
	 * 
	 * @return A TreeMap containing the result of the analysis
	 */
	public TreeMap<K,V> analyse(ArrayList<String> inputListSymptoms) {
		return analysisPerform.performAnalysis(inputListSymptoms);
	}
	
	/**
	 * Return the result contained in a TreeMap
	 * 
	 * @param tmResultSymptoms
	 * A TreeMap of Keys / Values, sorted by Keys.
	 */
	public void returnOutput(TreeMap<K,V> tmResultSymptoms) {
		resultWriter.writeResult(tmResultSymptoms);
	}
	
	/**
	 * Set the SymptomsReader strategy
	 */ 
	public void setSymptomsReader(ISymptomsReader symptomsReader) {
		this.symptomsReader=symptomsReader;
	}
	
	/**
	 * Set the AnalysisPerform strategy
	 */ 
	public void setAnalysisPerform(IAnalysisPerform<K,V> analysisPerform) {
		this.analysisPerform=analysisPerform;
	}
	
	/**
	 * Set the ResultWriter strategy
	 */ 
	public void setResultWriter(IResultWriter<K,V> resultWriter) {
		this.resultWriter=resultWriter;
	}
		
}
