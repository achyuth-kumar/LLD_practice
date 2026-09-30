public class Main {
    public static void main(String[] args) {
        BasePizza basePizza=new ExtraCheese(new ExraMushroom(new VegPizza()));
        System.out.println(basePizza.cost());

        basePizza=new ExtraCheese(new ExraMushroom(new NonVegPizza()));
        System.out.println(basePizza.cost());

    }
}
