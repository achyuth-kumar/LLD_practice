public class Main {
    public static void main(String args[]) {
        //2*(1+7)
        ArthematicExpession leftExpression=new Num(1);
        ArthematicExpession rightExpression=new Num(7);
        Expression expression=new Expression(leftExpression,rightExpression,Operations.ADD.getValue());
        int value=expression.evavluate();
        leftExpression=new Num(2);
        rightExpression=new Num(value);
        expression=new Expression(leftExpression,rightExpression,Operations.MUL.getValue());
        System.out.println(expression.evavluate());
    }
}
