import com.sun.source.doctree.SystemPropertyTree;

import java.util.ArrayList;
import java.util.List;

public class ObservableServiceImpl implements Observable{
    Weather weather;
    @Override
    public void capctureWeatherCondition(Weather weather) {
        this.weather=weather;
    }

    @Override
    public void forCastWeatherCondition(Weather weather) {
        System.out.println(weather+" : Weather condition forcasted");
    }

    @Override
    public void notifyMe(List<NotificationServiceImpl> notificationServiceList) {
        for(NotificationServiceImpl notificationService : notificationServiceList) {
            notificationService.update(this.weather);
        }
    }
}
