public class Main {
    public static void main(String [] args) {
        // 2*(1+2)
        ArthematicExpression leftExpression = new Num(1);
        ArthematicExpression rightExpression=new Num(2);
        Expression expression=new Expression(leftExpression,rightExpression,Operations.ADD);
        leftExpression=new Num(2);
        rightExpression=new Num(expression.evaluate());
        expression=new Expression(leftExpression,rightExpression,Operations.MUL);
        System.out.println("Result : "+expression.evaluate());
    }
}
