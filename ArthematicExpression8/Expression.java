public class Expression implements ArithematicExpression{
    ArithematicExpression leftExpression, rightExpression;
    Operation operation;
    public Expression(ArithematicExpression leftExpression, ArithematicExpression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public Integer evaluate() {
        switch (operation) {
            case ADD : return leftExpression.evaluate()+ rightExpression.evaluate();
            case SUB : return leftExpression.evaluate()-rightExpression.evaluate();
            case MUL: return leftExpression.evaluate()* rightExpression.evaluate();
            case DIV: return leftExpression.evaluate()/rightExpression.evaluate();
        }
        return -1;
    }
}
