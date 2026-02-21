import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NotificationServiceImpl> notificationServiceList=new ArrayList<>();
        notificationServiceList.add(new MessageNotificationServiceImpl());
        notificationServiceList.add(new EmailNotificationServiceImpl());
        Observable cart=new ObservableServiceImpl(notificationServiceList);
        cart.addItem("A1");
        cart.addItem("A2");
        cart.addItem("A3");
        cart.addItem("A4");
        cart.addItem("A5");
        cart.notifyMe();
        cart.viewItems();
        cart.reorderItems("B1",0.0,1.0);
        System.out.println();
        cart.viewItems();

    }
}
