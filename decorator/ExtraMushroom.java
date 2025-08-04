public class ExtraMushroom extends TopDecorator {
    @Override
    public void ingredients() {
        System.out.println("Add extra ingredients for extra mushroom");
        addExtraMushroom();
    }
    public void addExtraMushroom() {
        System.out.println("Add extra mushroom");
    }
}