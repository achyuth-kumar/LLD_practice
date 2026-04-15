import javax.print.DocFlavor;
import java.util.Map;

public class Order {
    String orderId;
    String userId;
    String restaurantId;
    Map<String, Integer> items;

    public Order(String orderId, String userId, String restaurantId, Map<String, Integer> items) {
        this.orderId = orderId;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.items = items;
    }


}
