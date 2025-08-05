public class ShapeFactory  {
    public Shape getfactory(String input) {
        if(input.equals("circle")) {
            return new Circle();
        }
        else if(input.equals("square")) {
            return new Square();
        }
        else
            return null;
    }
}