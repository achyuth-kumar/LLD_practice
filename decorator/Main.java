public class Main {
    public static void main(String args[]) {
        BasePizza pizza=new VegPizza();
        pizza.ingredients();
        BasePizza extraCheese=new ExtraCheese();
        extraCheese.ingredients();
        BasePizza extraMushroom=new ExtraMushroom();
        extraMushroom.ingredients();
    }
}