public class Main {
    public static void main(String [] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape=shapeFactory.createShapeFactory("circle");
        shape.draw();

        shape=shapeFactory.createShapeFactory("square");
        shape.draw();

    }
}
