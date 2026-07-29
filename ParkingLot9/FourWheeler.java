import java.util.HashMap;

public class FourWheeler implements Vehicle{
    Integer customerID;
    HashMap<Integer,Slot> customerBooking;
    Boolean booked;
    ParkingSpace parkingSpace;
    public FourWheeler(Integer customerID, HashMap<Integer, Slot> customerBooking, Boolean booked, ParkingSpace parkingSpace) {
        this.customerID = customerID;
        this.customerBooking = customerBooking;
        this.booked = booked;
        this.parkingSpace=parkingSpace;
    }

    @Override
    public boolean getAvailability(Integer slotID, Integer startTime, Integer endTime) {
        if(customerBooking.get(slotID)!=null) {
            Pair<Integer,Integer> existingBooking=customerBooking.get(slotID).getBooking();
            if(startTime>=existingBooking.first && endTime<=existingBooking.second) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void processBooking(Integer slotID, Integer startTime, Integer endTime) {
        if(getAvailability(slotID,startTime,endTime)) {
            this.booked=true;
            System.out.println(slotID+" , slot booked successfully");
        }
        else {
            System.out.println(slotID+" , slot not available");
        }
    }

    @Override
    public void processPayment(Integer amount) {
        if(this.booked) {
            Integer cost= parkingSpace.cost();
            if(amount<cost) {
                System.out.println("Insufficient amount");
                return ;
            }
            else if(amount>cost){
                System.out.println("Please lend back the change "+(amount-cost));
            }
            System.out.println("Payment processed successfully");
        }
        else {
            System.out.println("Booking is not successful, cant proceed with payment");
        }
    }
}
