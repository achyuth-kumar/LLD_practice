public class MessageNotificationServiceImpl implements Observer{
    @Override
    public void update() {
        System.out.println("Message Notification's sent");
    }
}
