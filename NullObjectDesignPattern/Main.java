public class Main {
    public static void main(String args[]) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape=shapeFactory.getFactory("square1");
        shape.draw();
    }
}
