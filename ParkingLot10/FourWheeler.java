import java.util.HashMap;

public class FourWheeler implements Vehicle{
    HashMap<Integer,Slot> slotBooking;
    boolean booked;
    ParkingSpace space;
    public FourWheeler(HashMap<Integer, Slot> slotBooking, boolean booked, ParkingSpace space) {
        this.slotBooking = slotBooking;
        this.space=space;
        this.booked=booked;
    }

    @Override
    public boolean getAvailability(Integer slotId, Integer startTime, Integer endTime) {
        if(slotBooking.containsKey(slotId)) {
            Pair<Integer,Integer> existingBooking=slotBooking.get(slotId).getCurrentBooking();
            if(startTime>=existingBooking.first && endTime<=existingBooking.second) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void processBooking(Integer slotId, Integer startTime, Integer endTime) {
        if(getAvailability(slotId, startTime, endTime)) {
            System.out.println(slotId+" , booked successfully");
            this.booked=true;
            space.checkIn(startTime);
            space.checkOut(endTime);
            slotBooking.put(slotId,new Slot(slotId,true,new Pair<>(startTime,endTime)));
        }
        else {
            this.booked=false;
            System.out.println(slotId+" , slot not available");
        }
    }

    @Override
    public void processPayment(Integer amount) {
        if(this.booked) {
            Integer cost= space.cost();
            if(amount<cost) {
                System.out.println("Insufficient amount");
                return ;
            }
            else if(amount>cost) {
                System.out.println("Please lend back the change : "+(amount-cost));
            }
            System.out.println("Payment processed successfully");
        }
        else {
            System.out.println("Booking is not successful, hence cant proceed with payment");
        }
    }
}
