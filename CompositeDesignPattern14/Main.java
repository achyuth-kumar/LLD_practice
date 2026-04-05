import com.sun.source.tree.CompilationUnitTree;

public class Main {
    public static void main(String [] args) {
        ArthematicExpression leftExpression=new Number(1);
        ArthematicExpression rightExpression=new Number(7);
        ArthematicExpression expression=new Expression(leftExpression,rightExpression,Operation.ADD);
        rightExpression=new Number(expression.evaluate());
        leftExpression=new Number(2);
        expression=new Expression(leftExpression,rightExpression,Operation.MUL);
        System.out.println("result : "+expression.evaluate());
    }
}
