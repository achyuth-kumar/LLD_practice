public class Main {
    public static void main(String args[]) {
        ShapeFactory factory=new ShapeFactory();
        Shape shape=factory.getfactory("square");
        shape.draw();
    }
}