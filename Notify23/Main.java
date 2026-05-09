import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<NotificationServiceImpl> notificationServiceList=new ArrayList<>();
        notificationServiceList.add(new MessageNotificationServiceImpl());
        notificationServiceList.add(new EmailNotificationServiceImpl());
        Observable observable=new ObservableServiceImpl(notificationServiceList);
        observable.addItem("Item1");
        observable.removeItem("Item1");
        observable.notifyMe();
    }
}
