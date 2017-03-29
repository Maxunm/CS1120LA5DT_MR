package edu.wmich.cs1120.la5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.RandomAccessFile;

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
    	
    	RandomAccessFile(new File(fileName, "r")) datFile= new RandomAccessFile();
    	
    	
    	String line;
		String[] info;
		double radiation = 0;
		double elevation= 0; 
		double basicEnergyCost;
		char operator = 'c';
		int val1 = 0;
		int val2 = 0;
    	//exF.getExpression(operator, val1, val2).getValue()*34;
    	
    	//comment, 34
    	
    	
    	
    	
    	setScanner(sc);

    }

    public TerrainScanner getScanner(){
        return sc;
    }

    public void setScanner(TerrainScanner scanner){
    	scanner.setTerrain(terrain);
    }
}
