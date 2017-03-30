package edu.wmich.cs1120.la5;

import java.io.IOException;


/* Assignment: ...
 * Author: Merrick Rumel
 * Author: Daniel Toth
 * Date: 3/15/2017
 * Reference: ...
 */
public interface IMapCreator {
	/**
	 * 
	 * @param fileName name of file
	 * @param threshold rover threshold
	 * @throws IOException exception to read file
	 */
    void scanTerrain(String fileName, int threshold) throws IOException;
// Read from the file, set up the edu.wmich.cs1120.la5.IArea[10][10] and set the
    //terrain for the object of TerrainScanner
    /**
     * getter for scanner
     * @return returns scanner
     */
    TerrainScanner getScanner();
    /**
     * setter for scanner
     * @param scanner scanner used
     */
    void setScanner(TerrainScanner scanner);
}
