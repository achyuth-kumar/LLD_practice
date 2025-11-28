public class Main {
    public static void main(String [] args) {
        BasePizza vegPizza=new ExtraCheese(new NonVegPizza());
        System.out.println("Cost : "+vegPizza.cost());
    }
}
