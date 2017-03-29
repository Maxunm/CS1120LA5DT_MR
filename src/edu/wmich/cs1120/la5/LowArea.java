package edu.wmich.cs1120.la5;

/* Assignment: ...
 * Author: Merrick Rumel
 * Date: 3/16/2017
 * Reference: ...
 */
public class LowArea extends Area{
    @Override
    public double calcConsumedEnergy(){
        return this.basicEnergy*2;
    }
}
