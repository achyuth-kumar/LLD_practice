public class ShapeFactory {
    public Shape getShape(String input) {
        if(input==null) {
            return new NullPointerHandler();
        }
        else if(input.equals("circle")) {
            return new Circle();
        }
        else if(input.equals("square")) {
            return new Square();
        }
        return null;
    }
} 