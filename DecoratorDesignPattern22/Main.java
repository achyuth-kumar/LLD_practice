public class Main {
    public static void main(String[] args) {
        BasePizza basePizza=new ExtraCheese(new ExtraMushroom(new VegPizza()));
        System.out.println(basePizza.cost());

        basePizza=new ExtraCheese(new ExtraMushroom(new NonVegPizza()));
        System.out.println(basePizza.cost());
    }
}
