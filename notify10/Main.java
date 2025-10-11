public class Main {
    public static void main(String[] args) {
        Observable observable=new ObservableImpl();
        observable.add();
        observable.remove();
        observable.notifyMe();
    }
}
