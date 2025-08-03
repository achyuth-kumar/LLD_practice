package Observable;
import Observer.*;
public interface objectObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifyMe();
    public void setCount(int c);
    public int getCount();
}