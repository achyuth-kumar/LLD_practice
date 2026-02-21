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
        Integer result=0;
        switch(operation){
            case Operation.ADD : result= leftExpression.evaluate()+rightExpression.evaluate();
                                break;
            case Operation.SUB : result= leftExpression.evaluate()-rightExpression.evaluate();
                break;
            case Operation.MUL:  result= leftExpression.evaluate()*rightExpression.evaluate();
                break;
            case Operation.DIV: result= leftExpression.evaluate()/rightExpression.evaluate();
                break;
        }
        return result;
    }
}
