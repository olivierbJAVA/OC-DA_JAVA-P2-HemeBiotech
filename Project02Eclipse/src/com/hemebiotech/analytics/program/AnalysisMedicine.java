package com.hemebiotech.analytics.program;

import com.hemebiotech.analytics.util.*;

/**
 * Concrete class to be used to perform a Medicine type analysis
 */
public class AnalysisMedicine extends Analysis<String,String> {

	public AnalysisMedicine(ISymptomsReader symptomsReader, IAnalysisPerform<String,String> analysisPerform, IResultWriter<String,String> resultWriter) {
		super(symptomsReader, analysisPerform, resultWriter);
	}
	
}
