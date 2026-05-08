public abstract class TopDecorator implements BasePizza{
    public BasePizza basePizza;
    public TopDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

}
