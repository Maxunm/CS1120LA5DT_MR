package edu.wmich.cs1120.la5;

import java.util.ArrayList;

/* Assignment: ...
 * Author: Merrick Rumel
 * Date: 3/15/2017
 * Reference: ...
 */
public interface IRover {
    ArrayList<IArea> getPath();
    // Set the path to be the given argument
    void setPath(ArrayList<IArea> path);
    // Analyze the path according to the type of the analyzer
    void analyzePath();
    // Get the result of the analysis according to the type of the analyzer
    String getAnalysis();
    void setAnalysis(String analysis);
    // Return the name of the analyzer
    String toString();
}
