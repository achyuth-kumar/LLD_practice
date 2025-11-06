public abstract class NotificationServiceImpl implements Observer{
    @Override
    public void Update(String notification) {
        System.out.println(notification+" : notification sent");
    }

}
