public class Num implements ArthmeticExpression{
    public int n;
    Num(int n) {
        this.n=n;
    }

    @Override
    public int evaluate() {
        return this.n;
    }
}

