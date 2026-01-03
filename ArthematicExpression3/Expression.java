public class Expression implements ArthematicExpression{
    public ArthematicExpression leftExpression,rightExpression;
    public Operations operations;
    public Expression(ArthematicExpression l,ArthematicExpression r,Operations operations) {
        this.leftExpression=l;
        this.rightExpression=r;
        this.operations=operations;
    }

    @Override
    public Integer Evaluate() {
        Integer res=0;
        switch(operations) {
            case Operations.ADD :
                res= leftExpression.Evaluate()+ rightExpression.Evaluate();
                break;
            case Operations.SUB:
                res= leftExpression.Evaluate()-rightExpression.Evaluate();
                break;
            case Operations.MUL:
                res= leftExpression.Evaluate()*rightExpression.Evaluate();
                break;
            case Operations.DIV:
                res= leftExpression.Evaluate()/rightExpression.Evaluate();
                break;
        }
        return res;
    }
}
