public class Main {
    public static void main(String [] args) {
        //2*(1+7)
        //2*8=16
        ArthematicExpression leftExpression=new Number(1);
        ArthematicExpression rightExpression=new Number(7);
        ArthematicExpression expression=new Expression(leftExpression,rightExpression,Operations.ADD);
        rightExpression=new Number(expression.evaluate());
        leftExpression=new Number(2);
        expression=new Expression(leftExpression,rightExpression,Operations.MUL);
        System.out.println("Result : "+expression.evaluate());
    }
}
