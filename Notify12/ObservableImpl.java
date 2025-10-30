import java.util.List;

public class ObservableImpl implements Observable{
    List<NotificationServiceImpl> notificationServiceList;
    ObservableImpl(List<NotificationServiceImpl>notificationServiceList) {
        this.notificationServiceList=notificationServiceList;
    }
    @Override
    public void addItem() {
        System.out.println("Item got added into cart");
    }

    @Override
    public void removeItem() {
        System.out.println("Item got removed from cart");
    }

    @Override
    public void NotifyMe() {
        for(NotificationServiceImpl notificationService: notificationServiceList) {
            if(notificationService instanceof EmailNotificationServiceImpl) {
                ((EmailNotificationServiceImpl)notificationService).update();
            }
            else if(notificationService instanceof MessageNotificationServiceImpl){
                ((MessageNotificationServiceImpl) notificationService).update();
            }
        }
    }
}
