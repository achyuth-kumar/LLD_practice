import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        People personOne=new PersonOne(true,"Achyuth",1);
        People personTwo=new PersonTwo(true,"Kumar",2);
        People personThree=new PersonThree(false,"Ravi",3);

        Weather weather1=new Weather(1,2,"Humidity, posibility of heavy rain",ForcastingType.FLOODS);
        Weather weather2=new Weather(2,30,"Road Cracks, posibility of EarthQuake",ForcastingType.EARTHQUAKE);
        Weather weather3=new Weather(3,40,"Posibility of Tsunami",ForcastingType.TSUNAMI);

        HashMap<People,Weather> Communication=new HashMap<>();
        Communication.put(personOne,weather1);
        Communication.put(personTwo,weather2);
        Communication.put(personThree,weather3);

        WeatherForcasting weatherForcasting=new WeatherForCastingImpl(Communication);

        weatherForcasting.SendWeatherData();
    }
}
