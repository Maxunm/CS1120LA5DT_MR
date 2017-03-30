package edu.wmich.cs1120.la5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* Assignment: ...
 * Author: Merrick Rumel
 * Author: Daniel Toth
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
    	RandomAccessFile datFile = null;
    	try{
    		datFile = new RandomAccessFile(fileName,"r");
        }catch(FileNotFoundException e){
    	    e.printStackTrace();
        }
    	
    	
    	
    	Integer pointer = new Integer(0);
		double radiation = 0;
		double elevation= 0; 
		double basicEnergyCost= 0;
		char operator = 'c';
		int val1 = 0;
		int val2 = 0;
		
		
		for (int i = 0; i < 10; i++){
			for (int j = 0; j <10; j++){
			
				datFile.seek(pointer.longValue());
				radiation = datFile.readDouble();
				elevation = datFile.readDouble();
				basicEnergyCost = datFile.readDouble();
				operator = datFile.readChar();
				val1 = datFile.readInt();
				val2 = datFile.readInt();
				
				if ((radiation < .5 && elevation > threshold *.5) || (radiation >=.5)){
					Area location = new HighArea();
					location.setBasicEnergyCost(basicEnergyCost);
					location.setElevation(elevation);
					location.setRadiation(radiation);
					location.calcConsumedEnergy();
					terrain[j][i] = location;
				}else{
					Area location = new LowArea();
					location.setBasicEnergyCost(basicEnergyCost);
					location.setElevation(elevation);
					location.setRadiation(radiation);
					terrain[j][i] = location;
				}
				
				
				pointer = exF.getExpression(operator, val1, val2).getValue()*34;
				
			}
			}
    	
    	
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
