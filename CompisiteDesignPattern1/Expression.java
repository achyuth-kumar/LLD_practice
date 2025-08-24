public class Expression implements  ArthmeticExpression{
    ArthmeticExpression leftExpression,rightExpression;
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
            case ADD :
                res= leftExpression.evaluate()+rightExpression.evaluate();
                break;
            case SUB :
                res= leftExpression.evaluate()-rightExpression.evaluate();
                break;

            case DIV :
                res= leftExpression.evaluate()/rightExpression.evaluate();
                break;

            case MUL :
                res= leftExpression.evaluate()*rightExpression.evaluate();
                break;
        }
        return res;
    }
}
