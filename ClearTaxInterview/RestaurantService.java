import java.util.*;

public class RestaurantService {
    Map<String,Restaurant> restaurants=new HashMap<>();
    public void registerRetaurant(String id, String name, Set<String> servicablePincodes) {
        restaurants.put(id,new Restaurant(id,name,servicablePincodes));
        System.out.println("Restaurant registered ID : "+id+" , name : "+name);
    }
    public void updateQuantity(String resId,String itemName,double price,int quantity) {
        Restaurant r=restaurants.get(resId);
        if(r!=null) {
            r.addOrUpdateItem(itemName,price,quantity);
        }
    }
    public List<Restaurant> getServicableRestaurants(String pincode) {
        List<Restaurant> result=new ArrayList<>();
        for(Restaurant r : restaurants.values()) {
            if(r.sericablePincodes.contains(pincode)) {
                for(MenuItem item : r.menu.values()) {
                    if(item.quantity>0) {
                        result.add(r);
                        break;
                    }
                }
            }
        }
        return result;
    }






}
