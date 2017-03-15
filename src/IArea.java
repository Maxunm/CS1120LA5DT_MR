/* Assignment: ...
 * Author: Merrick Rumel
 * Date: 3/15/2017
 * Reference: ...
 */
public interface IArea {
    double getBasicEnergyCost();
    void setBasicEnergyCost(double basicEnergyCost);
    double getElevation();
    void setElevation(double elevation);
    double getRadiation();
    void setRadiation(double radiation);
    double calcConsumedEnergy();
}
