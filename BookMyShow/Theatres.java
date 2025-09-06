import java.util.HashMap;

public class Theatres {
    public String city;
    public HashMap<String,Boolean> availableInTheatres=new HashMap<>();
    HashMap<String,Integer> prices=new HashMap<>();
    Theatres(String name,Integer price) {
        this.availableInTheatres.put(name,true);
        this.prices.put(name,price);
    }
    public void removeMovieInThreate(String name) {
        availableInTheatres.put(name,false);
    }
    public int getPrice(String name) {
        return prices.get(name);
    }
    public boolean getAvailabilityInTheatres(String name) {
        if(availableInTheatres.containsKey(name)) {
            return availableInTheatres.get(name);
        }
        return false;
    }
}
