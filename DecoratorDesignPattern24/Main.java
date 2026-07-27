public class Main {
    public static void main(String[] args) {
         BasePizza vegPizza=new ExtraCheese(new ExtraMushroom(new VegPizza()));
         System.out.println(vegPizza.cost());

        BasePizza nonVegPizza=new ExtraCheese(new ExtraMushroom(new NonVegPizza()));
        System.out.println(nonVegPizza.cost());

    }
}

