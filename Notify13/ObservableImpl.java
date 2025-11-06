import java.util.List;

public class ObservableImpl implements Observable{
    List<NotificationServiceImpl> notificationServiceList;
    ObservableImpl(List<NotificationServiceImpl> notificationServiceList) {
        this.notificationServiceList=notificationServiceList;
    }
    @Override
    public void Add() {
        System.out.println("Item got added into cart");
    }

    @Override
    public void Remove() {
        System.out.println("Item removed from cart");
    }

    @Override
    public void NotifyMe() {
        for(NotificationServiceImpl notificationService : notificationServiceList) {
            if(notificationService instanceof EmailNotificationServiceImpl) {
                (new EmailNotificationServiceImpl()).Update();
            }
            else if(notificationService instanceof MessageNotificationServiceImpl) {
                (new MessageNotificationServiceImpl()).Update();
            }
        }
    }
}
