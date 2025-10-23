public class Main {
    public static void main(String [] args) {
        //(2+1)*7 = 21
        //(1*3)+4=7
        ArthematicExpression leftExpression=new Number(1);
        ArthematicExpression rightExpression=new Number(3);
        Expression expression=new Expression(leftExpression,rightExpression,Operations.MUL);
        leftExpression=new Number(expression.Evaluate());
        rightExpression=new Number(4);
        expression=new Expression(leftExpression,rightExpression,Operations.ADD);
        System.out.println("result : "+expression.Evaluate());
    }

}
