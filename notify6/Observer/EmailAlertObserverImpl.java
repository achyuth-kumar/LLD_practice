package Observer;
public class EmailAlertObserverImpl implements NotificationAlertObServerImpl{
    String email;
    public EmailAlertObserverImpl() {

    }
    public EmailAlertObserverImpl(String input) {
        this.email=input;
    }
    @Override
    public void update() {
        pushNotification();
    }
    public void pushNotification() {
        System.out.println("Email notification have been sent : "+email);
    }
}