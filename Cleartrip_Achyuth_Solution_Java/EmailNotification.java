public class EmailNotification implements NotificationChannel{

    @Override
    public void send(String Message) {
        System.out.println("Email : "+Message);
    }
}
