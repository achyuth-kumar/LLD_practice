package Observer;
import Observer.*;
public class EmailAlertServiceImpl implements NotificationAlertObserver {
    String email;
    public EmailAlertServiceImpl(String input) {
        this.email=input;
    }
    public EmailAlertServiceImpl() {
    }
    @Override
    public void update() {
        pushEmailNotification();
    }
    public void pushEmailNotification() {
        System.out.println("Email notificatrion have been sent to "+email);
    }
}