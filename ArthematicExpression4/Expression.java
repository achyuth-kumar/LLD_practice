public class Expression implements ArthematicExpression{

    ArthematicExpression leftExpression,rightExpression;
    Operations operation;
    public Expression(ArthematicExpression leftExpression, ArthematicExpression rightExpression, Operations operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }
    @Override
    public Integer evaluate() {
        Integer res=0;
        switch (operation) {
            case Operations.ADD : res= leftExpression.evaluate()+ rightExpression.evaluate();
                                break;
            case Operations.SUB: res= leftExpression.evaluate()- rightExpression.evaluate();
                                break;
            case Operations.MUL:  res= leftExpression.evaluate()* rightExpression.evaluate();
                                break;
            case Operations.DIV: res= leftExpression.evaluate()/ rightExpression.evaluate();
                                break;
        }
        return res;
    }
}
