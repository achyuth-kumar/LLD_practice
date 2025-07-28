public class Factory {
    public Shape getShape(String input) {
        if(input.equals("circle")) {
            return new Circle();
        }
        else if(input.equals("square")) {
            return new Square();
        }
        else 
            return new NullPointer();
    }
}