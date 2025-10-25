import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherForCastingImpl implements  WeatherForcasting {
    HashMap<People,Weather> Communication=new HashMap<>();
    WeatherForCastingImpl(HashMap<People,Weather> Communication) {
        this.Communication=Communication;
    }

    @Override
    public void SendWeatherData() {
        for(Map.Entry<People,Weather> entry : Communication.entrySet()) {
            if(entry.getKey().IsSubscribed()) {
                entry.getKey().RecieveWeatherData(entry.getValue());
            }
            else {
                System.out.println(entry.getKey().getName()+" Not yet subscribed");
            }
        }
    }
}
