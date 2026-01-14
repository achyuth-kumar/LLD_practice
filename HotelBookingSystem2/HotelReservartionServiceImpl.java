import java.util.Currency;
import java.util.HashMap;

public class HotelReservartionServiceImpl implements HotelReservation{
    HashMap<Integer,Integer> customerBooking=new HashMap<>();
    HashMap<Integer,Pair<Integer,Integer>> RoomBooking=new HashMap<>();
    Boolean bookingConfirmed=false;
    Integer cost=0;
    @Override
    public boolean getAvailability(Integer CustomerID,Integer roomNo,Integer StartTime,Integer EndTime) {
        if(RoomBooking.get(roomNo)==null) {
            return true;
        }
        if(RoomBooking.get(roomNo)!=null) {
            Pair<Integer,Integer>CurrentBooking=RoomBooking.get(roomNo);
            if((StartTime>=CurrentBooking.first && EndTime<=CurrentBooking.second) ||
                    (StartTime>=CurrentBooking.first && StartTime<=CurrentBooking.second)||
                    (EndTime>=CurrentBooking.first && EndTime<=CurrentBooking.second)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void processBooking(Integer CustomerID,Integer roomNo,Integer StartTime,Integer EndTime) {
        if(getAvailability(CustomerID,roomNo,StartTime,EndTime)) {
            System.out.println(CustomerID+" : "+roomNo+" : Booked successfully" );
            customerBooking.put(CustomerID,roomNo);
            Pair<Integer,Integer> p=new Pair<>(StartTime,EndTime);
            RoomBooking.put(roomNo,p);
            this.bookingConfirmed=true;
            this.cost=(EndTime-StartTime)*10;
        }
        else {
            this.bookingConfirmed=false;
            System.out.println(roomNo+" : not available");
        }
    }

    @Override
    public void processPayment(Integer Amount) {
        if(this.bookingConfirmed) {
            if(Amount<cost) {
                System.out.println("Insuficient amount");
                return ;
            }
            else if(Amount>cost){
                System.out.println("Please lend back change : "+(Amount-cost));
            }
            System.out.println("Payment Successful");
        }
        else {
            System.out.println("Booking is not confirmed, to make payments");
        }
    }
}
