import java.util.List;

public class ObservableServiceImpl implements Observable{

    List<NotificationServiceImpl> notificationServiceList;
    public ObservableServiceImpl(List<NotificationServiceImpl> notificationServiceList) {
        this.notificationServiceList = notificationServiceList;
    }
    @Override
    public void addItem(String item) {
        System.out.println(item+" : got added into cart ");
    }

    @Override
    public void removeItem(String item) {
        System.out.println(item+" : removed from cart ");
    }

    @Override
    public void notifyMe() {
        for(Observer o : notificationServiceList) {
            o.update();
        }
    }
}
