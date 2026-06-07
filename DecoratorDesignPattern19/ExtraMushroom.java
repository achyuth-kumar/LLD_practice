public class ExtraMushroom extends TopDecorator{
    public ExtraMushroom(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public Integer cost() {
        return basePizza.cost()+15;
    }
}
