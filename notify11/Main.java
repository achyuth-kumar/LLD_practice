import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<NotificationServiceImpl> notificationServiceList=new ArrayList<>();
        notificationServiceList.add(new EmailNotificationServiceImpl());
        notificationServiceList.add(new MessageNotificationServiceImpl());
        Observable observable=new ObservableImpl(notificationServiceList);
        observable.AddItem();
        observable.RemoveItem();
        observable.NotifyMe();
    }
}
