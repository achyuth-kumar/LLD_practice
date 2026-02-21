import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<NotificationServiceImpl> notificationServiceList=new ArrayList<>();
        notificationServiceList.add(new EmailNotificationServiceImpl());
        notificationServiceList.add(new MessageNotificationServiceImpl());
        Observable cart=new ObservableServiceImpl(notificationServiceList);
        cart.addItem(1,1);
        cart.removeItem(1,1);
        cart.notifyMe();
    }
}
