public class Num implements  ArthematicExpression {
    public int n;
    Num(int n) {
        this.n=n;
    }
    public int evaluate() {
        return this.n;
    }
}
