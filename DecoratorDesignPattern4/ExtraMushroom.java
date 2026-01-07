public class ExtraMushroom extends TopDecorator{
    BasePizza basePizza;

    public ExtraMushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    
    public int cost() {
        return basePizza.cost()+15;
    }

}
