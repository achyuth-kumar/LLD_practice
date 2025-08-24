public class Main {
    public static void main(String [] args) {
        ArthmeticExpression leftExpresison=new Num(1);
        ArthmeticExpression rightExpresison=new Num(2);
        Expression expression=new Expression(leftExpresison,rightExpresison,Operations.ADD);
        int value=expression.evaluate();
        leftExpresison=new Num(3);
        rightExpresison = new Num(value);
        expression = new Expression(leftExpresison,rightExpresison,Operations.MUL);
        System.out.println("Result : "+expression.evaluate());
    }
}
