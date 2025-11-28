public class ExtraCheese extends TopDecorator{
    public ExtraCheese(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return basePizza.cost()+10;
    }

}
