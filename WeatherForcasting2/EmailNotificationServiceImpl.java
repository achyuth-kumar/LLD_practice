public class EmailNotificationServiceImpl extends NotificationServiceImpl{
    @Override
    public void update(Weather weather){
        System.out.println(weather+" : Email notification sent");
    }
}
