package edu.wmich.cs1120.la5;

import java.util.ArrayList;

/* Assignment: ...
 * Author: Merrick Rumel
 * Author: Daniel Toth
 * Date: 3/15/2017
 * Reference: ...
 */
public interface IRover {
	/**
	 * getter for path
	 * @return returns path
	 */
    ArrayList<IArea> getPath();
    // Set the path to be the given argument
    /**
     * setter for path
     * @param path path arrayList
     */
    void setPath(ArrayList<IArea> path);
    // Analyze the path according to the type of the analyzer
    /**
     * 
     */
    void analyzePath();
    // Get the result of the analysis according to the type of the analyzer
    /**
     * getter for analysis
     * @return
     */
    String getAnalysis();
    /**
     * setter or analysis
     * @param analysis
     */
    void setAnalysis(String analysis);
    // Return the name of the analyzer
    String toString();
}
