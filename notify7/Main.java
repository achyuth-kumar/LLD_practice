public class Main {
    public static void main(String args[]) {
        BasePizza pizza=new NonVegPizza();
        System.out.println("pizza cost : "+pizza.cost());
        TopDecorator decorator=new ExtraMushroom(pizza);
        System.out.println("Extra decorator cost : "+decorator.cost());
    }
}