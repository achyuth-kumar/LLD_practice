public class Main {
    public static void main(String [] args) {
        BasePizza basePizza=new ExtraCheese(new ExtraMushroom(new VegPizza()));
//        BasePizza basePizza=new ExtraCheese(new VegPizza());
        System.out.println("Cost : "+basePizza.cost());
    }
}
