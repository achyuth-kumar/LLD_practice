public abstract class TopDecorator implements BasePizza{
    BasePizza basePizza;

    public TopDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }


}
