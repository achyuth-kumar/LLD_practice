public class Expression implements  ArthematicExpression{
    ArthematicExpression leftExpression,rightExpression;
    public Operation operation;
    Expression(ArthematicExpression leftExpression,ArthematicExpression rightExpression,Operation operation) {
        this.leftExpression=leftExpression;
        this.rightExpression=rightExpression;
        this.operation=operation;
    }
    @Override
    public int evluate() {
        int res=0;
        switch (operation) {
            case ADD:
                res= leftExpression.evluate()+rightExpression.evluate();
                break;
            case SUB:
                res= leftExpression.evluate()-rightExpression.evluate();
                break;
            case MUL:
                res= leftExpression.evluate()*rightExpression.evluate();
                break;
            case DIV:
                res= leftExpression.evluate()/rightExpression.evluate();
                break;
            default :
                res=-1;
                break;
        }
        return res;
    }
}
