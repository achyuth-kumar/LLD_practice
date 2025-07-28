public class Main {
    public static void main(String args[]) {
        Observable observable=new Observable();
        observable.add(1);
        observable.add(2);
        observable.add(3);
        observable.display();
        observable.remove(1);
        observable.display();
    }
}