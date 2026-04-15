import javax.print.DocFlavor;
import java.util.*;

public class Main {
    public static void main(String [] args) {
        RestaurantService rs=new RestaurantService();
        OrderService os=new OrderService(rs);
        RatingService ratingService=new RatingService(rs);
        rs.registerRetaurant("R1","KFC",new HashSet<>(Collections.singleton("560001")));
        rs.updateQuantity("R1","Burger",100,2);
        ratingService.rateRestaurant("U1","R1",5,"Great");
        List<Restaurant> list=rs.getServicableRestaurants("560001");
        list.sort(RestaurantComparator.byRating());
        Map<String, Integer> items=new HashMap<>();
        items.put("Burger",2);
        os.placeOrder("O1","U1","R1",items);
        System.out.println("Orders : "+os.getOrderHistory("U1").size());

        items.put("Burger",2);
        os.placeOrder("O2","U1","R1",items);
        System.out.println("Orders : "+os.getOrderHistory("U1").size());


        list.sort(RestaurantComparator.byPrice("Burger"));
        for(Restaurant restaurant : list) {
            System.out.println(restaurant.id+" , "+restaurant.name);
        }
    }
}
