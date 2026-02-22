public class Number implements ArthematicExpression{
    Integer n;
    public Number(Integer n) {
        this.n = n;
    }
    @Override
    public Integer evaluate() {
        return this.n;
    }
}
