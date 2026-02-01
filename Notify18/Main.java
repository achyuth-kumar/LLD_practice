import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<NotificationServiceImpl> notificationServiceList= List.of(new MailNotificationServiceImpl(),new MessageNotificationServiceImpl());
        Observable observable=new ObservableServiceImpl(notificationServiceList);
        observable.addItem();
        observable.removeItem();
        observable.notifyMe();
    }
}
