public class Main {
    public static void main(String [] args) {
        ArthmeticExpression leftExpression=new Num(2);
        ArthmeticExpression rightExpression=new Num(5);
        Expression expression=new Expression(leftExpression,rightExpression,Operations.ADD);
        leftExpression=new Num(4);
        rightExpression=new Num(expression.evaluate());
        expression=new Expression(leftExpression,rightExpression,Operations.MUL);
        System.out.println("Result : "+expression.evaluate());
    }
}
