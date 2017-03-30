package edu.wmich.cs1120.la5;

/* Assignment: ...
 * Author: Merrick Rumel
 * Author: Daniel Toth
 * Date: 3/15/2017
 * Reference: ...
 */
public interface IOperation {
    // perform the operation accordingly and return the value
	/**
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
    Integer perform(IExpression left, IExpression right);
}
