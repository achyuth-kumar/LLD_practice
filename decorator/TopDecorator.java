public class TopDecorator implements BasePizza {
    @Override
    public void ingredients() {
        System.out.println("Top ingredients");
    }
}