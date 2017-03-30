package edu.wmich.cs1120.la5;

/* Assignment: ...
 * Author: Merrick Rumel
 * Author: Daniel Toth
 * Date: 3/16/2017
 * Reference: ...
 */
public class Literal implements IExpression {
    private Integer number;

    /**
     *  sets value of Integer number
     * @param lit integer the Integer number is set to
     */
    public Literal(Integer lit){
        number = lit;
    }
    /**
     * @return returns value of Integer number
     */
    public Integer getValue(){
        return number;
    }
}
