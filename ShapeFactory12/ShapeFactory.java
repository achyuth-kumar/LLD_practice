public class ShapeFactory {
    public Shape createShape(String input) {
        if(input.equals("circle")) {
            return new Circle();
        }
        else if(input.equals("square")) {
            return new Square();
        }
        return null;
    }
}
