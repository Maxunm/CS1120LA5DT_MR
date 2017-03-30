package edu.wmich.cs1120.la5;

/* Assignment: ...
 * Author: Merrick Rumel
 * Author: Daniel Toth
 * Date: 3/16/2017
 * Reference: ...
 */
public class BinaryExpression implements IExpression {
    private IOperation operation;
    private IExpression leftVal;
    private IExpression rightVal;
    /**
     * 
     * @param op identifies operator
     * @param lef first value used by operator
     * @param rig second value used by operator
     */
    public BinaryExpression(IOperation op, IExpression lef, IExpression rig){
        operation = op;
        leftVal = lef;
        rightVal = rig;
    }
    /**
     * @return returns operation as decided by ExpressionFactory
     */
    public Integer getValue(){
        return operation.perform(leftVal,rightVal);
    }
}
