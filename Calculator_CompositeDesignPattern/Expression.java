public class Expression implements ArthematicExpession{
    ArthematicExpession leftExpression,rightExpression;
    public String operation;
    Expression(ArthematicExpession leftExpression,ArthematicExpession rightExpression,String operation) {
        this.leftExpression=leftExpression;
        this.rightExpression=rightExpression;
        this.operation=operation;
    }

    @Override
    public int evavluate() {
        int res=0;
        switch(operation) {
            case "ADD":
                res= leftExpression.evavluate()+rightExpression.evavluate();
                break;
            case "SUB":
                res= leftExpression.evavluate()-rightExpression.evavluate();
                break;
            case "MUL":
                res= leftExpression.evavluate()*rightExpression.evavluate();
                break;
            case "DIV":
                res= leftExpression.evavluate()/rightExpression.evavluate();
                break;
            default:
                res=-1;
                break;
        }
        return res;
    }
}
