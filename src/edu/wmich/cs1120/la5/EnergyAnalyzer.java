package edu.wmich.cs1120.la5;

import java.util.ArrayList;

/* Assignment: ...
 * Author: Merrick Rumel
 * Author: Daniel Toth
 * Date: 3/16/2017
 * Reference: ...
 */
public class EnergyAnalyzer implements IRover {
    private ArrayList<IArea> path;
    private String total;
    /**
     * @return returns null
     */
    public ArrayList<IArea> getPath(){
        return null;
    }
    // Set the path to be the given argument
    /**
     * @param path path arraylist
     */
    public void setPath(ArrayList<IArea> path){
        this.path = path;
    }
    // Analyze the path according to the type of the analyzer
    /**
     * analyzes the chosen path
     */
    public void analyzePath(){
        double runTotal = 0;
        for (IArea a:
                path) {
            runTotal+=a.calcConsumedEnergy();
        }
        total = Double.toString(runTotal);
    }
    // Get the result of the analysis according to the type of the analyzer
    /**
     * getter for analysis
     * @return returns analysis
     */
    public String getAnalysis(){
        return total;
    }
    /**
     * @param analysis analysis String used by program
     */
    public void setAnalysis(String analysis){
        total = analysis;
    }
    // Return the name of the analyzer
    /**
     * @return returns "Energy Analyzer"
     */
    public String toString(){
        return "Energy Analyzer";
    }
}
