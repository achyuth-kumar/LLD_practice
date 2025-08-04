public class ExtraMushroom extends TopDecorator {
    BasePizza basePizza;
    public ExtraMushroom(BasePizza basePizza) {
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+20;
    }
}