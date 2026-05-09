import java.util.List;
import java.util.Observer;

public class ObservableServiceImpl implements Observable{

    List<NotificationServiceImpl> notificationServiceList;
    public ObservableServiceImpl(List<NotificationServiceImpl> notificationServiceList) {
        this.notificationServiceList = notificationServiceList;
    }
    @Override
    public void addItem(String item) {
        System.out.println(item+" : got added into cart");
    }

    @Override
    public void removeItem(String item) {
        System.out.println(item+" : removed from cart");
    }

    @Override
    public void notifyMe() {
        for(NotificationServiceImpl notificationService : notificationServiceList) {
            notificationService.update();
        }
    }
}
