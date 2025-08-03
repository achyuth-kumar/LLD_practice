package Observable;
import Observer.*;
import java.util.*;
public class objectObservableImpl implements objectObservable {
    int count=0;
    NotificationAlertObserver notificationAlertObserver=new NotificationAlertObserver();
    public objectObservableImpl(int c,NotificationAlertObserver n) {
        this.count=c;
        this.notificationAlertObserver=n;
    }
    List<NotificationAlertObserver> observerList=new ArrayList<>();
    @Override
    public void add(NotificationAlertObserver n) {
        observerList.add(n);
    }
    @Override
    public void remove(NotificationAlertObserver n) {
        observerList.remove(n);
    }
    @Override
    public void notifyMe() {
        for(NotificationAlertObserver o : observerList) {
            o.update();
        }
    }
    @Override
    public void setCount(int c) {
        this.count+=c;
    }
    @Override
    public int getCount() {
        return this.count;
    }
}