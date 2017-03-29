package edu.wmich.cs1120.la5;

import java.io.IOException;

/* Assignment: ...
 * Author: Merrick Rumel
 * Date: 3/16/2017
 * Reference: ...
 */
public class MapCreatorFromDat implements IMapCreator {
	//three doubles, char, two int
	//area array 
	//elevation, energy, radiation
	private ExpressionFactory exF = new ExpressionFactory();
	private Area[][] terrain = new Area[10][10];
	private TerrainScanner sc = new TerrainScanner();
	
    public void scanTerrain(String fileName, int threshold) throws IOException {

    	//exF.getExpression(operator, val1, val2).getValue();
    	
    	//comment
    	
    	
    	
    	
    	setScanner(sc);

    }

    public TerrainScanner getScanner(){
        return sc;
    }

    public void setScanner(TerrainScanner scanner){
    	scanner.setTerrain(terrain);
    }
}
