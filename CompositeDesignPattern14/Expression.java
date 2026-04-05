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
        switch (operation) {
            case ADD :  return leftExpression.evaluate()+ rightExpression.evaluate();
            case SUB:   return leftExpression.evaluate()- rightExpression.evaluate();
            case MUL:  return leftExpression.evaluate()*rightExpression.evaluate();
            case DIV:  return leftExpression.evaluate()/rightExpression.evaluate();
        }
        return 0;
    }
}
