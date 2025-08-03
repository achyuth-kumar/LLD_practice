package Observable;
import Observer.*;
import java.util.*;
public class IphoneObservableServiceImpl implements itemObservable {
    Integer count=0;
    NotificationAlertObServerImpl n;
    public IphoneObservableServiceImpl(Integer count,NotificationAlertObServerImpl n) {
        this.count=count;
        this.n=n;
    }
    List<NotificationAlertObServerImpl> observerList=new ArrayList<>();
    @Override
    public void add(NotificationAlertObServerImpl o) {
        observerList.add(o);
    }
    @Override
    public void remove(NotificationAlertObServerImpl o) {
        observerList.remove(o);
    }
    @Override
    public void notifyMe() {
        for(NotificationAlertObServerImpl o : observerList) {
            o.update();
        }
    }
    @Override
    public void setCount(int c) {
        this.count+=c;
    } 
    @Override
    public Integer getCount() {
        return this.count;
    }
}