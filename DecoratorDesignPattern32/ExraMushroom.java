public class ExraMushroom extends TopDecorator{
    public ExraMushroom(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public Integer cost() {
        return basePizza.cost()+15;
    }
}
