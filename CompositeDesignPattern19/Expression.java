import java.lang.management.OperatingSystemMXBean;

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
            case Operation.ADD : return leftExpression.evaluate()+ rightExpression.evaluate();
            case Operation.SUB : return leftExpression.evaluate()-rightExpression.evaluate();
            case Operation.MUL : return leftExpression.evaluate()*rightExpression.evaluate();
            case Operation.DIV: return leftExpression.evaluate()/rightExpression.evaluate();
        }
        return -1;
    }
}
