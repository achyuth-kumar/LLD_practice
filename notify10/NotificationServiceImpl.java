public class NotificationServiceImpl implements Observer {

    @Override
    public void update(String notificationType) {
        System.out.println(notificationType+" notifications have been sent to End-User");
    }
    
    
}
