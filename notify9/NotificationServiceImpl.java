public class NotificationServiceImpl implements Observer{
    @Override
    public void update(String notification) {
        System.out.println(notification+" alerts");
    }
}
