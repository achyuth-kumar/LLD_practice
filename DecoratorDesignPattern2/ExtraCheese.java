public class ExtraCheese extends TopDecorator{
    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza) {
        this.basePizza=basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+10;
    }
}
