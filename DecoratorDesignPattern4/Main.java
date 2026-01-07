
public class Main {
    public static void main(String [] args) {
        ExtraMushroom extraMushroom=new ExtraMushroom(new VegPizza());
        System.out.println("VegPizza + ExtraMushroom : "+extraMushroom.cost());

        ExtraCheese extraCheese=new ExtraCheese(new NonVegPizza());
        System.out.println("NonVegPizza + ExtraCheese : "+extraCheese.cost());
    }
}
