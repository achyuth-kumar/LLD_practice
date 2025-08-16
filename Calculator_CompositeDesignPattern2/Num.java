public class Num implements  ArthimeticExpression{
    public int n;
    Num(int n) {
        this.n=n;
    }
    @Override
    public int evaluate() {
        return this.n;
    }
}
