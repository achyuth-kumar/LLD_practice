import java.util.List;

public class ObservableServiceImpl implements Observable{

    List<NotificationServiceImpl> notificationServiceList;
    public ObservableServiceImpl(List<NotificationServiceImpl> notificationServiceList) {
        this.notificationServiceList = notificationServiceList;
    }
    @Override
    public void AddItem() {
        System.out.println("Item Added");
    }

    @Override
    public void removeItem() {
        System.out.println("Item Removed");
    }

    @Override
    public void NotifyMe() {
        for(NotificationServiceImpl notificationService : notificationServiceList) {
            notificationService.update();
        }
    }
}
