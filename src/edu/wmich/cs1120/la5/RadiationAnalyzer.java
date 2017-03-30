package edu.wmich.cs1120.la5;

import java.util.ArrayList;

/* Assignment: ...
 * Author: Merrick Rumel
 * Author: Daniel Toth
 * Date: 3/16/2017
 * Reference: ...
 */
public class RadiationAnalyzer implements IRover{
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
     * path setter
     * @param path arrayList for the path
     */
    public void setPath(ArrayList<IArea> path){
        this.path = path;
    }
    // Analyze the path according to the type of the analyzer
    /**
     * analysis radiation on path
     */
    public void analyzePath(){
        double runTotal = 0;
        for (IArea a:
             path) {
            runTotal+=a.getRadiation();
        }
        total = Double.toString(runTotal);
    }
    // Get the result of the analysis according to the type of the analyzer
    /**
     * getter of analysis
     * @return returns analysis
     */
    public String getAnalysis(){
        return total;
    }
    /**
     * setter for analysis
     * @param analysis analysis used
     */
    public void setAnalysis(String analysis){
        total = analysis;
    }
    // Return the name of the analyzer
    /**
     * @return returns String "Radiation"
     */
    public String toString(){
        return "Radiation";
    }
}
