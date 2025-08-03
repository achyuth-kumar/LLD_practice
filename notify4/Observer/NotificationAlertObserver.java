package Observer;
public class NotificationAlertObserver {
    String email;
    public NotificationAlertObserver() {
    }
    public NotificationAlertObserver(String input) {
        this.email=input;
    }
    public void update() {
        pushNotification();
    }
    public void pushNotification() {
        System.out.println("Notification has been sent to "+email);
    }
}