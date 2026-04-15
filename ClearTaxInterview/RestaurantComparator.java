import java.util.Comparator;

public class RestaurantComparator {
    public static Comparator<Restaurant> byRating() {
        return (a,b)->Double.compare(b.getAvgRating(),a.getAvgRating());
    }
    public static Comparator<Restaurant> byPrice(String itemName) {
        return (a,b)-> {
            double p1=a.menu.get(itemName).price;
            double p2=b.menu.get(itemName).price;
            return Double.compare(p1,p2);
        };
    }
}
