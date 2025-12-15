import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<NotificationServiceImpl> notificationServiceList=new ArrayList<>();
        notificationServiceList.add(new EmailNotificationServiceImpl());
        notificationServiceList.add(new MessageNotificationServiceImpl());
        Observable observable=new ObservableServiceImpl(notificationServiceList);
        observable.addItem();
        observable.removeItem();
        observable.NotifyMe();
    }
}
