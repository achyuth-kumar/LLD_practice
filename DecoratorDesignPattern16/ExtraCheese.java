public class ExtraCheese extends TopDecorator {

    public ExtraCheese(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public Integer cost() {
        return basePizza.cost()+10;
    }
}
