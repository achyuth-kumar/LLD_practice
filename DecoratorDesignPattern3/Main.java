public class Main {
    public static void main(String [] args) {
        BasePizza basePizza=new ExtraMushroom(new ExtraCheese(new VegPizza()));
        System.out.println("cost : "+basePizza.cost());
    }
}
