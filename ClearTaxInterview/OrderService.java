import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService {
    Map<String, List<Order>> userOrders=new HashMap<>();
    RestaurantService restaurantService;
    public OrderService(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }
    public void placeOrder(String orderId,String userId,String restId,Map<String,Integer> items) {
        //hadnel NLP
        if(!restaurantService.restaurants.containsKey(restId)) {
            System.out.println("Invalid restaurant");
        }
        Restaurant r=restaurantService.restaurants.get(restId);
        for(Map.Entry<String,Integer> entry:items.entrySet()) {
            MenuItem item=r.menu.get(entry.getKey());
            if(item==null || item.quantity<entry.getValue()) {
                throw new RuntimeException("Invalid order");
            }
        }
        //deduct quantity
        for(Map.Entry<String,Integer> entry : items.entrySet()) {
            MenuItem item=r.menu.get(entry.getKey());
            item.quantity-=entry.getValue();
        }
        Order order=new Order(orderId,userId,restId,items);
        System.out.println("Placed order : orderID : "+orderId+" , user ID : "+userId+" Restaurant ID  : "+restId);
        userOrders.computeIfAbsent(userId,k->new ArrayList<>()).add(order);
    }
    public List<Order> getOrderHistory(String userId) {
        return userOrders.getOrDefault(userId,new ArrayList<>());
    }
}
