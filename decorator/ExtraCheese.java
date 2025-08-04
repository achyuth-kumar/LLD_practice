public class ExtraCheese extends TopDecorator {
    @Override
    public void ingredients() {
        System.out.println("Add extra ingredients for extra cheese");
        addExtraCheese();
    }
    public void addExtraCheese() {
        System.out.println("Add extra cheese");
    }
}