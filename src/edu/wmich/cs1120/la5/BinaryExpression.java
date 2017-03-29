package edu.wmich.cs1120.la5;

/* Assignment: ...
 * Author: Merrick Rumel
 * Date: 3/16/2017
 * Reference: ...
 */
public class BinaryExpression implements IExpression {
    private IOperation operation;
    private IExpression leftVal;
    private IExpression rightVal;

    public BinaryExpression(IOperation op, IExpression lef, IExpression rig){
        operation = op;
        leftVal = lef;
        rightVal = rig;
    }
    public Integer getValue(){
        return operation.perform(leftVal,rightVal);
    }
}
