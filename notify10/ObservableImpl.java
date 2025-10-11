import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
    List<NotificationServiceImpl> notifications=new ArrayList<>();
    ObservableImpl() {
        notifications.add(new EmailNotificationServiceImpl());
        notifications.add(new MessageNotificationServiceImpl());
    }
    @Override
    public void add() {
        System.out.println("Item added to cart");
    }
    @Override
    public void remove() {
        System.out.println("Item removed from cart");
    }

    @Override
    public void notifyMe() {
        for(NotificationServiceImpl o : notifications) {
            if(o instanceof EmailNotificationServiceImpl)
                o.update("Email");
            else
                o.update("Message");
        }
    }
}
