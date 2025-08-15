public class Main {
    public static void main(String args[]) {
        //Expression -> 2*(1+2)
        ArthematicExpression leftExpression=new Num(1);
        ArthematicExpression rightExpression=new Num(2);
        Expression expression=new Expression(leftExpression,rightExpression,Operation.ADD);
        int value=expression.evluate();
        leftExpression=new Num(2);
        rightExpression=new Num(value);
        expression=new Expression(leftExpression,rightExpression,Operation.MUL);
        System.out.println("Result : "+expression.evluate());
    }
}
