public class Num implements ArthematicExpression{
    int n;
    Num(int n) {
        this.n=n;
    }

    @Override
    public int evalute() {
        return this.n;
    }
}
