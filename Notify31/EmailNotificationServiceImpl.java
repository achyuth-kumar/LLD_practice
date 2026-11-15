public class EmailNotificationServiceImpl implements Observer{
    @Override
    public void update() {
        System.out.println("Email Notification's sent");
    }
}
