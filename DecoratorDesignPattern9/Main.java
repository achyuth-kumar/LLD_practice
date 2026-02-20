public class Main {
    public static void main(String[] args) {
        BasePizza basePizza=new ExtraCheese(new VegPizza());
        System.out.println(basePizza.cost());
        basePizza=new ExtraMushroom(new ExtraCheese(new NonVegPizza()));
        System.out.println(basePizza.cost());
    }
}
