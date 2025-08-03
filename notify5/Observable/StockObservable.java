package Observable;
import Observer.*;
public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifyMe();
    public void setCoin(int newCoin);
    public Integer getCoin();
}