import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class RestaurantServiceImpl implements Restaurant{
    HashMap<Integer, HashMap<Integer,Integer>>CustomerBooking;
    HashMap<Integer,Integer>FoodAvailability,Prices;
    Integer TotalPrice;
    public RestaurantServiceImpl(HashMap<Integer,Integer> FoodAvailability,HashMap<Integer,Integer> Prices) {
        this.CustomerBooking = new HashMap<>();
        this.FoodAvailability=FoodAvailability;
        this.Prices=Prices;
        this.TotalPrice=0;
    }

    @Override
    public void acceptOrder(Integer CustomerId,Integer FoodId,Integer Quantity) {
        if(FoodAvailability.get(FoodId)==0) {
            System.out.println(FoodId+" : Food is not available");
            return ;
        }
        HashMap<Integer,Integer> bookings=CustomerBooking.get(CustomerId);
        if(bookings==null) {
            bookings=new HashMap<>();
            bookings.put(FoodId,Quantity);
        }
        else{
            bookings.put(FoodId, bookings.getOrDefault(FoodId, 0) + Quantity);
        }

        CustomerBooking.put(CustomerId,bookings);
        FoodAvailability.put(FoodId,FoodAvailability.getOrDefault(FoodId,0)-Quantity);
        TotalPrice+=Prices.get(FoodId)*Quantity;
        System.out.println(FoodId+" : Order got accepted for custoemr : "+CustomerId);
    }

    @Override
    public boolean processPayment(Integer CustomerId,Integer FoodId,Integer Amount) {
        if(Amount<TotalPrice) {
            System.out.println("Insufficient amount");
            return false;
        }
        if(Amount>TotalPrice) {
            System.out.println("Lend back change : "+(Amount-TotalPrice));
        }
        System.out.println(FoodId+ " : food processed for : "+CustomerId);
        return true;
    }

    @Override
    public void dispenseOrder(Integer CustomerId,Integer FoodId) {
        System.out.println(FoodId+" : Item dispensed for customer : "+CustomerId);
    }
}
