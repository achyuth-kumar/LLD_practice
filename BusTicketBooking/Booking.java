import java.util.HashMap;
import java.util.List;

public class Booking {
    public int source,destination,busPosition;
    public int price=100;
    public HashMap<Integer,Integer> CustomerBooking=new HashMap<>();
    public HashMap<Integer, List<Integer>> SeatAvailability=new HashMap<>();
    Booking(int source,int destination,int busPosition) {
        this.source=source;
        this.destination=destination;
        this.busPosition=busPosition;
        for(int i=0;i<10;i++) {
            SeatAvailability.put(i,null);
        }
    }
    public void Accelerate(int speed) {
        this.busPosition+=speed;
    }
    public Boolean getAvailability(int SeatNo) {
        if(SeatAvailability.containsKey(SeatNo) && SeatAvailability.get(SeatNo)!=null) {
            return false;
        }
        return true;
    }
    public void TicketBooking(int CustomerId,int amount,int SeatNo,int CustomerSource,int CustomerDestination) {
        if(SeatAvailability.containsKey(SeatNo) && SeatAvailability.get(SeatNo)!=null) {
            List<Integer> oldBooking=SeatAvailability.get(SeatNo);
            if(this.busPosition>=oldBooking.get(1)) {
                CustomerBooking.remove(CustomerId);
                SeatAvailability.put(SeatNo, null);
            }
        }
        if(this.getAvailability(SeatNo) && this.busPosition<=CustomerSource) {
            CustomerBooking.put(CustomerId,SeatNo);
            SeatAvailability.put(SeatNo, List.of(new Integer[]{CustomerSource, CustomerDestination}));
            System.out.println("Customer : "+CustomerId+" : Booking details : "+CustomerSource+" : "+CustomerDestination);
            this.makePayment(amount);
        }
        else if(!this.getAvailability(SeatNo)){
            System.out.println("Seat number : "+SeatNo+" Not available");
        }
    }
    public void makePayment(int amount) {
        if(amount<price) {
            System.out.println("Insufficient amount");
            this.getConfirmation(false);
        }
        else {
            System.out.println("Please take back change : "+(price-amount));
            this.getConfirmation(true);
        }
    }
    public void getConfirmation(Boolean confirmation) {
        if(confirmation) {
            System.out.println("Booking successfully completed");
        }
        else {
            System.out.println("Booking didnt completed successfully");
        }
    }
}

