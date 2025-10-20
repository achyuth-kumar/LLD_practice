public class NotificationServiceImpl implements Observer {
    @Override
    public void Update(String NotificationType) {
        System.out.println(NotificationType+" : Notifications sent");
    }
}
