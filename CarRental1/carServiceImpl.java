import javax.swing.plaf.IconUIResource;
import java.util.HashMap;

public class carServiceImpl implements carService{
    HashMap<Integer,Integer> customerBooking=new HashMap<>();
    HashMap<Integer,Pair<Integer,Integer>> seatBooking=new HashMap<>();
    Integer cost;
    Integer booked;

    public carServiceImpl() {
        this.booked = 0;
        this.cost = 0;
    }

    @Override
    public boolean getAvailability(Integer customerId,Integer seatId,Integer startTime,Integer endTime) {
        if(seatBooking.get(seatId)==null) {
            return  true;
        }
        if(seatBooking.get(seatId)!=null) {
            Pair<Integer, Integer> currentBooking = seatBooking.get(seatId);
            if ((startTime >= currentBooking.first && endTime <= currentBooking.second) ||
                    (startTime >= currentBooking.first && startTime <= currentBooking.second) ||
                    (endTime >= currentBooking.first && endTime <= currentBooking.second)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void processBooking(Integer customerId,Integer seatId,Integer startTime,Integer endTime) {
        if(getAvailability(customerId,seatId,startTime,endTime)) {
            System.out.println(customerId+" , "+seatId+" : Booked successfully");
            this.booked=1;
            this.cost=(endTime-startTime)*10;
            customerBooking.put(customerId,seatId);
            seatBooking.put(seatId,new Pair<>(startTime,endTime));
        }
        else {
            this.booked=0;
            System.out.println(customerId+" , "+seatId+" : Seat not available");
        }
    }

    @Override
    public void processPayment(Integer amount) {
        if(this.booked==1) {
            System.out.println("cost : "+cost);
            if(amount<cost) {
                System.out.println("Insufficient amount");
                return ;
            }
            else if(amount>cost) {
                System.out.println("Please lend back change : "+(amount-cost));
            }
            System.out.println("Payment successful");
        }
        else {
            System.out.println("Booking failed, no payment accepted");
        }
    }
}
