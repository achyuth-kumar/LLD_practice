import Observer.*;
import Observable.*;
public class Main {
    public static void main(String args []) {
        NotificationAlertObserver observer1=new NotificationAlertObserver("hunrgry_coder@ai.com");
        objectObservableImpl o=new objectObservableImpl(0,observer1);
        o.add(observer1);
        o.setCount(5);
        System.out.println(o.getCount());
        o.notifyMe();
        o.remove(observer1);
    }
}