import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<NotificationServiceImpl> observerList=List.of(new EmailNotificationServiceImpl(),new MessageNotificationServiceImpl());
        Observable observable=new ObservableServiceImpl(observerList);
        observable.addItem();
        observable.removeItem();
        observable.NotifyMe();

    }
}
