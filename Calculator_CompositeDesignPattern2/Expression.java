public class Expression implements ArthimeticExpression{
    ArthimeticExpression leftExpression,rightExpression;
    Operations operations;
    Expression(ArthimeticExpression leftExpression,ArthimeticExpression rightExpression,Operations operations) {
        this.leftExpression=leftExpression;
        this.rightExpression=rightExpression;
        this.operations=operations;
    }
    @Override
    public int evaluate() {
        int res=0;
        switch(operations) {
            case ADD:
                res=leftExpression.evaluate()+rightExpression.evaluate();
                break;
            case SUB:
                res=leftExpression.evaluate()-rightExpression.evaluate();
                break;
            case MUL:
                res=leftExpression.evaluate()*rightExpression.evaluate();
                break;
            case DIV:
                res=leftExpression.evaluate()/rightExpression.evaluate();
                break;
            default:
                res=-1;
                break;
        }
        return res;
    }
}
