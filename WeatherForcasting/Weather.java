public class Weather {
    public Integer id,temperature;
    public String Descrption;
    public ForcastingType type;

    public Integer getId() {
        return id;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public String getDescrption() {
        return Descrption;
    }

    public ForcastingType getType() {
        return type;
    }


    public Weather(Integer id, Integer temperature, String descrption, ForcastingType type) {
        this.id = id;
        this.temperature = temperature;
        this.Descrption = descrption;
        this.type = type;
    }


}
