public class Main {
    public static void main(String [] args) {
        Factory factory=new Factory();
        Shape circle=factory.getShape("circle");
        circle.draw();
        Shape square=factory.getShape("square");
        square.draw();
        
    }
}