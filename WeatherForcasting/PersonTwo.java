public class PersonTwo implements People{
    public boolean IsSubscibed;

    public String name;
    public Integer id;

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public PersonTwo(boolean isSubscibed, String name, Integer id) {
        this.IsSubscibed = isSubscibed;
        this.name = name;
        this.id = id;
    }


    @Override
    public boolean IsSubscribed() {
        return this.IsSubscibed;
    }

    @Override
    public void RecieveWeatherData(Weather weather) {
        System.out.println("Person Two Recieved : "+weather.getTemperature()+","+weather.getDescrption()+" , "+weather.getType());
    }
}
