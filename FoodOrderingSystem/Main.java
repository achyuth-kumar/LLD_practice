import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        Customer customer=new Customer(1,"Achyuth");
        Food food=new Food(1,"Biriyani");
        HashMap<Integer,Integer> FoodAbvailability=new HashMap<>();
        HashMap<Integer,Integer> Prices=new HashMap<>();
        FoodAbvailability.put(food.getFoodId(),10);
        Prices.put(food.getFoodId(), 500);
        Restaurant restaurant=new RestaurantServiceImpl(FoodAbvailability,Prices);
        restaurant.acceptOrder(customer.getId(), food.getFoodId(),2);
        if(restaurant.processPayment(customer.getId(),food.getFoodId(),1200)) {
            restaurant.dispenseOrder(customer.getId(),food.getFoodId());
        }


    }
}
