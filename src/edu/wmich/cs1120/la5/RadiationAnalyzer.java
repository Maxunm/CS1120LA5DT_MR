package edu.wmich.cs1120.la5;

import java.util.ArrayList;

/* Assignment: ...
 * Author: Merrick Rumel
 * Date: 3/16/2017
 * Reference: ...
 */
public class RadiationAnalyzer implements IRover{
    private ArrayList<IArea> path;
    private String total;
    public ArrayList<IArea> getPath(){
        return null;
    }
    // Set the path to be the given argument
    public void setPath(ArrayList<IArea> path){
        this.path = path;
    }
    // Analyze the path according to the type of the analyzer
    public void analyzePath(){
        double runTotal = 0;
        for (IArea a:
             path) {
            runTotal+=a.getRadiation();
        }
        total = Double.toString(runTotal);
    }
    // Get the result of the analysis according to the type of the analyzer
    public String getAnalysis(){
        return total;
    }
    public void setAnalysis(String analysis){
        total = analysis;
    }
    // Return the name of the analyzer
    public String toString(){
        return "Radiation";
    }
}
