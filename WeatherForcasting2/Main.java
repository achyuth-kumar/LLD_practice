import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        Observable observable=new ObservableServiceImpl();
        observable.capctureWeatherCondition(Weather.HEAVY_RAIN);
        observable.forCastWeatherCondition(Weather.HEAVY_RAIN);
        List<NotificationServiceImpl> notificationServiceList=new ArrayList<>();
        notificationServiceList.add(new MessageNotificationServiceImpl());
        notificationServiceList.add(new EmailNotificationServiceImpl());
        observable.notifyMe(notificationServiceList);
    }
}
