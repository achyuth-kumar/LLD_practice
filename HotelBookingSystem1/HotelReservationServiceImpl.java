import java.util.HashMap;

public class HotelReservationServiceImpl implements HotelReservation{
    HashMap<Integer,Integer> CustomerBooking;
    HashMap<Integer,Pair<Integer,Integer>> RoomBooking;
    Integer cost;
    Boolean BookingConfirmed;
    public HotelReservationServiceImpl() {
        this.CustomerBooking = new HashMap<>();
        this.RoomBooking = new HashMap<>();
        this.cost=0;
        this.BookingConfirmed=false;
    }
    @Override
    public boolean getAvailability(Integer roomNo,Integer CustomerId,Integer StartTime,Integer EndTime) {
        if(CustomerBooking.get(CustomerId)==null) {
            return true;
        }
        if(CustomerBooking.get(CustomerId)!=null) {
            Integer CurrentRoom=CustomerBooking.get(CustomerId);
            Pair<Integer,Integer> CurrentBooking=RoomBooking.get(CurrentRoom);
            if( (StartTime>=CurrentBooking.first && EndTime<=CurrentBooking.second) ||
                    (StartTime>=CurrentBooking.first && StartTime<=CurrentBooking.second) ||
                    (EndTime>=CurrentBooking.first && EndTime<=CurrentBooking.second)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void processBooking(Integer roomNo,Integer CustomerId,Integer StartTime,Integer EndTime) {
        if(getAvailability(roomNo,CustomerId,StartTime,EndTime)) {
            System.out.println("Customer : "+CustomerId+" , "+roomNo+" : booked successfully");
            cost=(EndTime-StartTime)*10;
            CustomerBooking.put(CustomerId,roomNo);
            Pair<Integer,Integer> p=new Pair<>();
            p.first=StartTime;
            p.second=EndTime;
            RoomBooking.put(roomNo,p);
            this.BookingConfirmed=true;
        }
        else {
            this.BookingConfirmed=false;
            System.out.println(roomNo+" : room not available");
        }
    }

    @Override
    public void processPayment(Integer amount) {
        if(this.BookingConfirmed) {
            if (amount < cost) {
                System.out.println("Insufficient amount");
                return;
            } else if (amount > cost) {
                System.out.println("Please lend back change : " + (amount - cost));
            }
            System.out.println("Payment Successfull");
        }
        else {
            System.out.println("Booking is not yet confirmed");
        }
    }
}
