package Observer;
public class MobileAlertObserverImpl implements NotificationAlertObServerImpl{
    String email;
    public MobileAlertObserverImpl() {
    }
    public MobileAlertObserverImpl(String input) {
        this.email=input;
    }
    @Override
    public void update() {
        pushNotification();
    }
    public void pushNotification() {
        System.out.println("Mobile notification have been sent : "+email);
    }
}