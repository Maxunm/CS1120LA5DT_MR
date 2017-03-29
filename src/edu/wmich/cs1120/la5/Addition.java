package edu.wmich.cs1120.la5;

/* Assignment: ...
 * Author: Merrick Rumel
 * Date: 3/16/2017
 * Reference: ...
 */
public class Addition implements IOperation{
    // perform the operation accordingly and return the value
    public Integer perform(IExpression left, IExpression right){
        return left.getValue() + right.getValue();
    }
}
