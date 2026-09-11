public class Main {
    public static void main(String[] args) {
        ArthematicExpression leftExpression=new Number(1);
        ArthematicExpression rightExpression=new Number(3);
        ArthematicExpression expression=new Expression(leftExpression,rightExpression,Operation.MUL);

        leftExpression=new Number(2);
        rightExpression=new Number(expression.evaluate());
        expression=new Expression(leftExpression,rightExpression,Operation.ADD);

        System.out.println(expression.evaluate());

    }
}
