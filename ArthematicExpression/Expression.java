public class Expression implements ArthematicExpression{
    ArthematicExpression leftExpression,rightExpression;
    Operations operation;
    Expression(ArthematicExpression leftExpression,ArthematicExpression rightExpression,Operations operation) {
        this.leftExpression=leftExpression;
        this.rightExpression=rightExpression;
        this.operation=operation;
    }

    @Override
    public Integer Evaluate() {
        Integer res=0;
        switch(operation) {
            case ADD : res= leftExpression.Evaluate()+ rightExpression.Evaluate();
                        break;
            case SUB : res= leftExpression.Evaluate()-rightExpression.Evaluate();
                break;
            case MUL: res= leftExpression.Evaluate()*rightExpression.Evaluate();
                break;
            case DIV : res= leftExpression.Evaluate()/rightExpression.Evaluate();
                break;
        }
        return res;
    }
}
