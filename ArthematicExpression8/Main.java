public class Main {
    public static void main(String[] args) {
        ArithematicExpression leftExpression=new Number(1);
        ArithematicExpression rightExpression=new Number(7);
        ArithematicExpression expression=new Expression(leftExpression,rightExpression,Operation.ADD);
        leftExpression=new Number(2);
        rightExpression=new Number(expression.evaluate());
        expression=new Expression(leftExpression,rightExpression,Operation.MUL);
        System.out.println("Result : "+expression.evaluate());

    }
}
