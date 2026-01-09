public class Main {
    public static void main(String [] args) {
        ExtraCheese extraCheese=new ExtraCheese(new ExtraMushroom(new VegPizza()));
        System.out.println("Veg Pizza cost : "+extraCheese.cost());

        ExtraMushroom extraMushroom =new ExtraMushroom(new ExtraCheese(new NonVegPizza()));
        System.out.println("Non-Veg Pizza cost : "+extraMushroom.cost());

    }
}
