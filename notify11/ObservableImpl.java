import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
    List<NotificationServiceImpl> notificationServiceList=new ArrayList<>();
    ObservableImpl(List<NotificationServiceImpl> notificationServiceList) {
        this.notificationServiceList=notificationServiceList;
    }
    @Override
    public void AddItem() {
        System.out.println("Item got added into cart");
    }

    @Override
    public void RemoveItem() {
        System.out.println("Item removed from cart");
    }

    @Override
    public void NotifyMe() {
        String NotificationType="";
        for(NotificationServiceImpl notificationService : notificationServiceList) {
            if(notificationService instanceof EmailNotificationServiceImpl) {
                NotificationType = "Email";
            }
            else if(notificationService instanceof MessageNotificationServiceImpl) {
                NotificationType = "Message";
            }
            notificationService.Update(NotificationType);
        }
    }
}
