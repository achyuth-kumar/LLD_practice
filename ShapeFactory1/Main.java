public class Main {
    public static void main(String [] args) {
        Factory factory=new Factory();
        Shape shape=factory.getShape("circle");
        shape.draw();
    }
}