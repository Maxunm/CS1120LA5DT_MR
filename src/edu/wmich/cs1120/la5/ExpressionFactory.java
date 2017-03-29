package edu.wmich.cs1120.la5;

/* Assignment: ...
 * Author: Merrick Rumel
 * Date: 3/16/2017
 * Reference: ...
 */
public class ExpressionFactory {
    // This method will create and return a proper object
    //according to the arguments received
    public static IExpression getExpression(char operator, int val1, int val2) {
        // fill your code here
        switch (operator){
            case '-':
                return new BinaryExpression(new Subtraction(),new Literal(val1),new Literal(val2));
            case '+':
                return new BinaryExpression(new Addition(),new Literal(val1),new Literal(val2));
            default:
                return null;
        }
    }
}
