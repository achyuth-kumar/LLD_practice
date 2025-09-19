import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        Observable observable=new ObservableImpl();
        observable.addItem(1,"Coke");
        observable.addItem(2,"Pepsi");
        observable.addItem(3,"Sprite");
        observable.removeItem(2);
        List<NotificationServiceImpl> notificationServiceList=new ArrayList<>();
        notificationServiceList.add(new EmailNotificationServiceImpl());
        notificationServiceList.add(new MessageNotificationServiceImpl());
        observable.displayCartItems();
        observable.notification(notificationServiceList);

    }

}
