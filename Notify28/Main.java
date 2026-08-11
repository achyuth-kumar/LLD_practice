import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Observer> observerList= List.of(new EmailNotificationServiceImpl(),new MessageNotificationServiceImpl());
        Observable observable=new ObservableServiceImpl(observerList);
        observable.addItem("demo");
        observable.removeItem("demo");
        observable.NotifyMe();
    }
}
