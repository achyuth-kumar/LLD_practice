public class Main {
    public static void main(String [] args) {
        BasePizza vegPizza=new ExtraCheese(new VegPizza());
        System.out.println(vegPizza.cost());

        BasePizza nonVegPizza=new ExtraMushroom(new ExtraCheese(new NonVegPizza()));
        System.out.println(nonVegPizza.cost());

    }
}
