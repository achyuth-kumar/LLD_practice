import java.util.List;

public class ObservableServiceImpl implements Observable{


    List<NotificationServiceImpl> notificationServiceList;
    public ObservableServiceImpl(List<NotificationServiceImpl> notificationServiceList) {
        this.notificationServiceList = notificationServiceList;
    }

    @Override
    public void addItem() {
        System.out.println("Item added into cart");
    }

    @Override
    public void removeItem() {
        System.out.println("Item removed from cart");
    }

    @Override
    public void notifyMe() {
        for(NotificationServiceImpl notificationService:notificationServiceList) {
            notificationService.update();
        }
    }
}
