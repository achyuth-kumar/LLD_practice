public class ExtraCheese extends TopDecorator{

    public BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public Integer cost() {
        return basePizza.cost()+10;
    }
}
