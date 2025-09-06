import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class Movies {
    public String name;
    public HashMap<String, Boolean> movieAvailable=new HashMap<>();
    Movies(String name) {
        this.name=name;
        this.movieAvailable.put(name,true);
    }
    public void removeMovie(String name) {
        movieAvailable.put(name,false);
    }
    public boolean getMovieAvailability(String name) {
        if(movieAvailable.containsKey(name)) {
            return movieAvailable.get(name);
        }
        return false;
    }
}
