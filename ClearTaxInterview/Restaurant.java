import java.util.*;

public class Restaurant {
    String id;
    String name;
    Set<String> sericablePincodes;
    //ConcurrentHashMap - normal thread safety for multiple
    //ConcurrentSkipListMap -
    //
    Map<String,MenuItem> menu=new HashMap<>();
    List<Rating> ratingList=new ArrayList<>();

    public Restaurant(String id, String name, Set<String> sericablePincodes) {
        this.id = id;
        this.name = name;
        this.sericablePincodes = sericablePincodes;
    }

    public Restaurant(String id, String name, Set<String> sericablePincodes, Map<String, MenuItem> menu, List<Rating> ratingList) {
        this.id = id;
        this.name = name;
        this.sericablePincodes = sericablePincodes;
        this.menu = menu;
        this.ratingList = ratingList;
    }
    public void addOrUpdateItem(String itemName,double price,int quantity) {
        menu.put(itemName,new MenuItem(itemName,price,quantity));
    }
    public double getAvgRating() {
        if(ratingList.isEmpty()) {
            double v = 0.0;
            return v;
        }
        double sum=0;
        for(Rating r : ratingList) {
            sum+=r.rating;
        }
        return sum/ratingList.size();
    }

}
