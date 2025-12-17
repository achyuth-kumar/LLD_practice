public class SMSNotification implements NotificationChannel{

    @Override
    public void send(String Message) {
        System.out.println("SMS : "+Message);
    }
}
