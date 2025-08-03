package Observable;
import Observer.*;
import java.util.*;
public class IphoneObservableServiceImpl implements StockObservable{
    int count=0;
    List<NotificationAlertObserver> observerList=new ArrayList<>();
    @Override 
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }
    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }
    @Override
    public void notifyMe() {
        for(NotificationAlertObserver o : observerList) {
            o.update();
        }
    }
    @Override
    public void setCoin(int c){
        this.count+=c;
    }
    @Override
    public Integer getCoin() {
        return this.count;
    }

}