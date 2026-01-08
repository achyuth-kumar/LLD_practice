public class ExtraMushroom extends TopDecorator{

    BasePizza basePizza;
    public ExtraMushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public Integer cost() {
        return basePizza.cost()+15;
    }
}
