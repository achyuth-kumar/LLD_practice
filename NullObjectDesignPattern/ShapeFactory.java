public class ShapeFactory {
    public Shape getFactory(String input) {
        if(input.equals("circle")) {
            return new Circle();
        }
        else if(input.equals("square")) {
            return new Square();
        }
        else
            return new NullObject();
    }
}
