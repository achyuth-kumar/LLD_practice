import Observable.*;
import Observer.*;
public class Main {
    public static void main(String args[]) {
        StockObservable IphoneObservable=new IphoneObservableServiceImpl();
        NotificationAlertObserver observer=new EmailAlertServiceImpl("hungry_coder@ai.com"); 
        IphoneObservable.add(observer);
        IphoneObservable.notifyMe();
        IphoneObservable.setCoin(5);
    }
}