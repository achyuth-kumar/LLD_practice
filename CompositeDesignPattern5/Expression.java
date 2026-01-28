public class Expression implements ArthematicExpression{
    ArthematicExpression leftExpression,rightExpression;
    Operations operations;
    public Expression(ArthematicExpression leftExpression, ArthematicExpression rightExpression, Operations operations) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operations = operations;
    }
    @Override
    public Integer evaluate() {
        Integer res=0;
        switch(operations) {
            case Operations.ADD : res=leftExpression.evaluate()+ rightExpression.evaluate();
                break;
            case Operations.SUB: res=leftExpression.evaluate()-rightExpression.evaluate();
                break;
            case Operations.MUL: res=leftExpression.evaluate()*rightExpression.evaluate();
                break;
            case Operations.DIV:res=leftExpression.evaluate()/rightExpression.evaluate();
                break;
        }
        return res;
    }
}
