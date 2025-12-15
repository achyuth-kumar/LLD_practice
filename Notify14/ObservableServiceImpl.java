import java.util.List;

public class ObservableServiceImpl implements Observable{


    List<NotificationServiceImpl> notificationServiceList;
    public ObservableServiceImpl(List<NotificationServiceImpl> notificationServiceList) {
        this.notificationServiceList = notificationServiceList;
    }
    @Override
    public void addItem() {
        System.out.println("Item added");
    }

    @Override
    public void removeItem() {
        System.out.println("Item removed");
    }

    @Override
    public void NotifyMe() {
        for(NotificationServiceImpl notificationService: notificationServiceList) {
            notificationService.update();
        }
    }
}
