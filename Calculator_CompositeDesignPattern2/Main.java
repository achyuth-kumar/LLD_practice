public class Main {
    public static void main(String [] args) {
        ArthimeticExpression leftExpression=new Num(10);
        ArthimeticExpression rightExpression=new Num(70);
        Expression expression=new Expression(leftExpression,rightExpression,Operations.ADD);
        int value=expression.evaluate();
        leftExpression=new Num(20);
        rightExpression=new Num(value);
        expression=new Expression(leftExpression,rightExpression,Operations.MUL);
        System.out.println("result : "+expression.evaluate());
    }
}
