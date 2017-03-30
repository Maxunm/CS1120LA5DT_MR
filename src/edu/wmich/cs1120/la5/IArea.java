package edu.wmich.cs1120.la5;

/* Assignment: ...
 * Author: Merrick Rumel
 * Date: 3/15/2017
 * Reference: ...
 */
public interface IArea {
	/**
	 * 
	 * @return returns basicEnergyCost, the baseline level on energy
	 */
    double getBasicEnergyCost();
    /**
     * 
     * @param basicEnergyCost baseline energy to traverse area before calculations
     */
    void setBasicEnergyCost(double basicEnergyCost);
    /**
     * 
     * @return returns elevation
     */
    double getElevation();
    /**
     * 
     * @param elevation level of elevation in area
     */
    void setElevation(double elevation);
    /**
     * 
     * @return returns radiation
     */
    double getRadiation();
    /**
     * 
     * @param radiation level of radiation in area
     */
    void setRadiation(double radiation);
    /**
     * this method is used by either highArea or lowArea to calculate energy used
     * @return returns basicEnergy
     */
    double calcConsumedEnergy();
}
