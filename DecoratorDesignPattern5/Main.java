public class Main {
    public static void main(String [] args) {
        ExtraCheese extraCheese=new ExtraCheese(new ExtraMushroom(new VegPizza()));
        System.out.println(extraCheese.cost());
    }
}

