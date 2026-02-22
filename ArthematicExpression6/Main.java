public class Main {
    public static void main(String [] args) {
        ArthematicExpression leftExpression=new Number(1);
        ArthematicExpression rightExpression=new Number(7);
        ArthematicExpression expression=new Expression(leftExpression,rightExpression,Operation.ADD);
        leftExpression=new Number(2);
        rightExpression=new Number(expression.evaluate());
        expression=new Expression(leftExpression,rightExpression,Operation.MUL);
        System.out.println("Result : "+expression.evaluate());
    }
}
