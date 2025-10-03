public class Expression implements ArthematicExpression {
    private ArthematicExpression leftExpression,rightExpression;
    Operations operation;
    Expression(ArthematicExpression leftExpression,ArthematicExpression rightExpression,Operations operation) {
        this.leftExpression=leftExpression;
        this.rightExpression=rightExpression;
        this.operation=operation;
    }
    public int evaluate() {
        int res=0;
        switch(operation) {
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
        }
        return res;
    }
}

