public class Main {
    public static void main(String [] args) {
        BasePizza basePizza=new ExtraCheese(new NonVegPizza());
        System.out.println(basePizza.cost());
    }
}
