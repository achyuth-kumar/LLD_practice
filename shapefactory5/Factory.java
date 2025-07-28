public class Factory {
    Shape getShape(String input) {
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