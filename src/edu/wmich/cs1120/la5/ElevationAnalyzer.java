package edu.wmich.cs1120.la5;

import java.util.ArrayList;

/* Assignment: ...
 * Author: Merrick Rumel
 * Author: Daniel Toth
 * Date: 3/16/2017
 * Reference: ...
 */
public class ElevationAnalyzer implements IRover{
    private ArrayList<IArea> path;
    private String total;
    /**
     * getter for path
     * @return returns null
     */
    public ArrayList<IArea> getPath(){
        return null;
    }
    // Set the path to be the given argument
    /**
     * @param path arraylist path
     */
    public void setPath(ArrayList<IArea> path){
        this.path = path;
    }
    // Analyze the path according to the type of the analyzer
    /**
     * analyze path based on analyzer
     */
    public void analyzePath(){
        double runTotal = 0;
        for (IArea a:
                path) {
            runTotal+=a.getElevation();
        }
        total = Double.toString(runTotal);
    }
    // Get the result of the analysis according to the type of the analyzer
    /**
     * getter for analysis, gets results of analysis
     * @return total returns total
     */
    public String getAnalysis(){
        return total;
    }
    /**
     * @param analysis analysis string
     */
    public void setAnalysis(String analysis){
        total = analysis;
    }
    // Return the name of the analyzer
    /**
     * @return returns Elevation Analyzer
     */
    public String toString(){
        return "Elevation Analyzer";
    }
}
