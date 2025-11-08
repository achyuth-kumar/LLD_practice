public class Main {
    public static void main(String[] args) {
        ArthematicExpression leftExpression=new Number(1);
        ArthematicExpression rightExpression=new Number(7);
        ArthematicExpression expression=new Expression(leftExpression,rightExpression,Operations.ADD);
        int value=expression.Evalute();
        leftExpression=new Number(2);
        rightExpression=new Number(value);
        expression=new Expression(leftExpression,rightExpression,Operations.MUL);
        System.out.println("Result : "+expression.Evalute());
    }

}
