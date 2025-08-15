public class Num implements  ArthematicExpression{
    public int n;
    Num(int n) {
        this.n=n;
    }
    @Override
    public int evluate() {
        return this.n;
    }
}
