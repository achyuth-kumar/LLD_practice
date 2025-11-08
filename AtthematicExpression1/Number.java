public class Number implements ArthematicExpression{
    public int n;

    public Number(int n) {
        this.n = n;
    }


    @Override
    public int Evalute() {
        return this.n;
    }
}
