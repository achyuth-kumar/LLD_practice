import java.util.List;

public interface Observable {
    public void capctureWeatherCondition(Weather weather);
    public void forCastWeatherCondition(Weather weather);
    public void notifyMe(List<NotificationServiceImpl> notificationServiceList);
}
