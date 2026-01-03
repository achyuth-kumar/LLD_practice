public class Number implements ArthematicExpression{

    public Integer num;
    public Number(Integer num) {
        this.num = num;
    }

    @Override
    public Integer Evaluate() {
        return this.num;
    }
}
