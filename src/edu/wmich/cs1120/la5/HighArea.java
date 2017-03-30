package edu.wmich.cs1120.la5;

/* Assignment: ...
 * Author: Merrick Rumel
 * Date: 3/16/2017
 * Reference: ...
 */
public class HighArea extends Area {
	/**
	 * @return returns basicEnergy*4
	 */
    @Override
    public double calcConsumedEnergy(){
        return this.basicEnergy*4;
    }
}
