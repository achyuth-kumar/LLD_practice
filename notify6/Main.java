import Observable.*;
import Observer.*;
public class Main {
    public static void main(String args[]) {
        NotificationAlertObServerImpl observer1=new EmailAlertObserverImpl("hungry_coder@ai.com");
        itemObservable IphoneObservable1=new IphoneObservableServiceImpl(0,observer1);
        IphoneObservable1.add(observer1);
        IphoneObservable1.notifyMe();


        NotificationAlertObServerImpl observer2=new MobileAlertObserverImpl("mobile@ai.com");
        itemObservable IphoneObservable2=new IphoneObservableServiceImpl(0,observer2);
        IphoneObservable2.add(observer2);
        IphoneObservable2.notifyMe();

    }    
}