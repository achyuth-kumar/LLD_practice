public class PushNotification implements NotificationChannel{

    @Override
    public void send(String Message) {
        System.out.println("PUSH : "+Message);
    }
}
