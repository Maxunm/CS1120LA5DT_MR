package edu.wmich.cs1120.la5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* Assignment: ...
 * Author: Merrick Rumel
 * Author: Daniel Toth
 * Date: 3/16/2017
 * Reference: ...
 */

public class MapCreatorFromTxt implements IMapCreator {
	private Area[][] terrain = new Area[10][10];
	private TerrainScanner mine = new TerrainScanner();

	/**
	 * The meat and potatoes of this class, this method reads the Terrain file, determines if the Area is high or low, and sets the Area 2d array accordingly.
	 * @param fileName The filename of the Terrain file.
	 * @param threshold The threshold of what the rover can go over.
	 * @throws IOException This is only thrown because we were instructed to, it should really be handled.
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		int countX = 0;
		int countY = 0;
		while(in.ready()){
			double basicEnergyCost;
			double elevation;
			double radiation;
			String[] tmp = in.readLine().split(" ");
			basicEnergyCost = Double.valueOf(tmp[0]);
			elevation = Double.valueOf(tmp[1]);
			radiation = Double.valueOf(tmp[2]);
			if(countX == 10){
				countY++;
				countX=0;
				if(radiation>=.5 || (radiation<.5 && elevation>(threshold*.5))){
					terrain[countY][countX] = new HighArea();
					terrain[countY][countX].setBasicEnergyCost(basicEnergyCost);
					terrain[countY][countX].setElevation(elevation);
					terrain[countY][countX].setRadiation(radiation);
				}else {
					terrain[countY][countX] = new LowArea();
					terrain[countY][countX].setBasicEnergyCost(basicEnergyCost);
					terrain[countY][countX].setElevation(elevation);
					terrain[countY][countX].setRadiation(radiation);
				}
			}else{
				if(radiation>=.5 || (radiation<.5 && elevation>(threshold*.5))){
					terrain[countY][countX] = new HighArea();
					terrain[countY][countX].setBasicEnergyCost(basicEnergyCost);
					terrain[countY][countX].setElevation(elevation);
					terrain[countY][countX].setRadiation(radiation);
				}else {
					terrain[countY][countX] = new LowArea();
					terrain[countY][countX].setBasicEnergyCost(basicEnergyCost);
					terrain[countY][countX].setElevation(elevation);
					terrain[countY][countX].setRadiation(radiation);
				}
			}
			countX++;
		}
		setScanner(mine);
	}

	/**
	 *
	 * @return the TerrainScanner used by this Class.
	 */
	public TerrainScanner getScanner(){
		return mine;
	}

	/**
	 *
	 * @param scanner The TerrainScanner that scanTerrain method will send the terrain to.
	 */
	public void setScanner(TerrainScanner scanner){
		scanner.setTerrain(terrain);
	}
}
