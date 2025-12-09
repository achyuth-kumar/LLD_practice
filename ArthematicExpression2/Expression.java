public class Expression implements ArthematicExpression{

    ArthematicExpression leftExpression,rightExpression;
    Operation operation;
    public Expression(ArthematicExpression leftExpression, ArthematicExpression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public Integer evaluate() {
        Integer res=0;
        switch (this.operation) {
            case Operation.ADD: res= leftExpression.evaluate()+rightExpression.evaluate();
                                break;
            case Operation.SUB: res= leftExpression.evaluate()-rightExpression.evaluate();
                            break;
            case Operation.DIV: res= leftExpression.evaluate()/rightExpression.evaluate();
                            break;
            case Operation.MUL: res= leftExpression.evaluate()*rightExpression.evaluate();
                    break;
        }
        return res;
    }
}
