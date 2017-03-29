package edu.wmich.cs1120.la5;

/* Assignment: ...
 * Author: Merrick Rumel
 * Date: 3/16/2017
 * Reference: ...
 */
public class Literal implements IExpression {
    private Integer number;

    public Literal(Integer lit){
        number = lit;
    }
    public Integer getValue(){
        return number;
    }
}
