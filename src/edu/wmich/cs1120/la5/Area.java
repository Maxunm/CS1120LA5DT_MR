package edu.wmich.cs1120.la5;

public abstract class Area implements IArea {
	double basicEnergy;
	private double elevation;
	private double radiation;
	@Override
	/**
	 * 
	 * @return returns basicEnergyCost, the baseline level on energy
	 */
	public double getBasicEnergyCost() {
		return basicEnergy;
	}
	/**
     * 
     * @param basicEnergyCost baseline energy to traverse area before calculations
     */
	@Override
	public void setBasicEnergyCost(double basicEnergyCost) {
		basicEnergy = basicEnergyCost;

	}
	 /**
     * 
     * @return returns elevation
     */
	@Override
	public double getElevation() {
		return elevation;
	}
	/**
     * 
     * @param elevation level of elevation in area
     */
	@Override
	public void setElevation(double elevation) {
		this.elevation = elevation;

	}
	/**
     * 
     * @return returns radiation
     */
	@Override
	public double getRadiation() {
		return radiation;
	}
	/**
     * 
     * @param radiation level of radiation in area
     */
	@Override
	public void setRadiation(double radiation) {
		this.radiation = radiation;

	}
	/**
     * this method is used by either highArea or lowArea to calculate energy used
     * @return returns basicEnergy
     */
	@Override
	public double calcConsumedEnergy() {
		return basicEnergy;
	}

}
