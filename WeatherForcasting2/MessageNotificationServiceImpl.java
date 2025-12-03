public class MessageNotificationServiceImpl extends NotificationServiceImpl{
    @Override
    public void update(Weather weather) {
        System.out.println(weather+" : Message notification sent");
    }
}
