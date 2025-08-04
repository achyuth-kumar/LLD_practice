public class Main {
    public static void main(String args[]) {
        BasePizza pizza=new VegPizza();
        System.out.println("Pizza cost : "+pizza.cost());
        TopDecorator decorator=new ExtraCheese(pizza);
        System.out.println("Decorator cost : "+decorator.cost());
    }
}