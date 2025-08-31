public class Main {
    public static void main(String [] args) {
        ArthematicExpression leftExpression=new Num(2);
        ArthematicExpression rightExpression=new Num(3);
        Expression expression=new Expression(leftExpression,rightExpression,Operations.ADD);
        int value=expression.evalute();
        leftExpression=new Num(3);
        rightExpression=new Num(value);
        expression=new Expression(leftExpression,rightExpression,Operations.MUL);
        System.out.println("Result : "+expression.evalute());
    }
}
