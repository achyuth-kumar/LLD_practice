public class ExtraMushroom extends TopDecorator{
    public ExtraMushroom(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return  basePizza.cost()+15;
    }
}
