import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Observer> observerList= List.of(new EmailNotificationServiceImpl(),new MessageNotificationServiceImpl());
        Observable observable=new ObservableServiceImpl(observerList);
        observable.addItem("item1");
        observable.removeItem("item1");
        observable.notifyMe();

    }
}
