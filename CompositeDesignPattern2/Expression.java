public class Expression implements ArthematicExpression{
    ArthematicExpression leftExpression,rightExpression;
    Operations operation;
    Expression(ArthematicExpression l,ArthematicExpression r,Operations o) {
        this.leftExpression=l;
        this.rightExpression=r;
        this.operation=o;
    }
    @Override
    public int evalute() {
        int res=0;
        switch (operation) {
            case ADD :
                res= leftExpression.evalute()+rightExpression.evalute();
                break;
            case SUB :
                res= leftExpression.evalute()-rightExpression.evalute();
                break;
            case MUL :
                res= leftExpression.evalute()*rightExpression.evalute();
                break;
            case DIV :
                res= leftExpression.evalute()/rightExpression.evalute();
                break;
        }
        return res;
    }
}
