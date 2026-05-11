public class Number implements ArithematicExpression{

    Integer n;
    public Number(Integer n) {
        this.n = n;
    }

    @Override
    public Integer evaluate() {
        return this.n;
    }
}
