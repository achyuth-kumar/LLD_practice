public class Expression implements ArthematicExpression{


    ArthematicExpression leftExpression,rightExpression;
    Operations operation;

    public Expression(ArthematicExpression leftExpression, ArthematicExpression rightExpression, Operations operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int Evalute() {
        int res=0;
        switch(operation) {
            case Operations.ADD : res= leftExpression.Evalute()+rightExpression.Evalute();
                break;
            case Operations.SUB : res= leftExpression.Evalute()-rightExpression.Evalute();
                break;
            case Operations.MUL : res= leftExpression.Evalute()*rightExpression.Evalute();
                break;
            case Operations.DIV : res= leftExpression.Evalute()/rightExpression.Evalute();
                break;
        }
        return res;
    }
}
