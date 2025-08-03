package Observer;
import Observer.*;
public class MobileAlterServiceImpl implements NotificationAlertObserver {
    String email;
    public MobileAlterServiceImpl(String input) {
        this.email=input;
    }
    public MobileAlterServiceImpl() {
    }
    @Override
    public void update() {
        pushEmailNotification();
    }
    public void pushEmailNotification() {
        System.out.println("Mobile Notificatrion have been sent to "+email);
    }
}