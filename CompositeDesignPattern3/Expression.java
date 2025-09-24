public class Expression implements ArthmeticExpression{
    ArthmeticExpression leftExpression;
    ArthmeticExpression rightExpression;
    Operations operation;

    Expression(ArthmeticExpression leftExpression,ArthmeticExpression rightExpression,Operations operation) {
        this.leftExpression=leftExpression;
        this.rightExpression=rightExpression;
        this.operation=operation;
    }
    @Override
    public int evaluate() {
        int res=0;
        switch(operation) {
            case Operations.ADD:
                res= leftExpression.evaluate()+ rightExpression.evaluate();
                break;
            case Operations.SUB:
                res= leftExpression.evaluate()-rightExpression.evaluate();
                break;
            case Operations.MUL:
                res= leftExpression.evaluate()*rightExpression.evaluate();
                break;
            case Operations.DIV:
                res= leftExpression.evaluate()/rightExpression.evaluate();
                break;
        }
        return res;
    }
}
