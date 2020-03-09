package com.hemebiotech.analytics;

/**
 * Concrete class to be used to perform a Counter type analysis
 */
public class AnalysisCounter extends Analysis<String,Integer> {

	public AnalysisCounter(ISymptomsReader symptomsReader, IAnalysisPerform<String,Integer> analysisPerform, IResultWriter<String,Integer> resultWriter) {
		super(symptomsReader, analysisPerform, resultWriter);
	}
	
}
