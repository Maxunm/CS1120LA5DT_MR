package edu.wmich.cs1120.la5;

/* Assignment: ...
 * Author: Merrick Rumel
 * Author: Daniel Toth
 * Date: 3/16/2017
 * Reference: ...
 */
public class Subtraction implements IOperation{
    // perform the operation accordingly and return the value
	/**
	 * @return returns left-right values
	 */
    public Integer perform(IExpression left, IExpression right){
        return left.getValue() - right.getValue();
    }
}
