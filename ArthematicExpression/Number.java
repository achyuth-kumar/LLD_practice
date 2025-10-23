public class Number implements ArthematicExpression{
    private Integer n;
    Number(Integer n) {
        this.n=n;
    }

    @Override
    public Integer Evaluate() {
        return this.n;
    }
}
