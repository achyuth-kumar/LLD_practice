package Observable;
import Observer.*;
public interface itemObservable {
    public void add(NotificationAlertObServerImpl o);
    public void remove(NotificationAlertObServerImpl o);
    public void notifyMe();
    public void setCount(int c);
    public Integer getCount();
}