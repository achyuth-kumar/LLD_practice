import java.util.HashMap;

public class TwoWheeler implements VehicleType{


    // Customer Booking <customerId,slotId>
    //Slot Booking <slotId,<startTime,endTime>>
    HashMap<Integer,Integer> CustomerBooking;
    HashMap<Integer,Pair<Integer,Integer>> SlotBooking;
    ParkingSpace parkingSpace;
    Integer InTime,OutTime;
    public TwoWheeler(ParkingSpace parkingSpace) {
        this.CustomerBooking = new HashMap<>();
        this.SlotBooking = new HashMap<>();
        this.parkingSpace=parkingSpace;
    }
    @Override
    public boolean getAvailability(Integer CustomerId,Integer NewStartTime,Integer NewEndTime) {
        if(CustomerBooking.get(CustomerId)==null) {
            return true;
        }
        if(CustomerBooking.get(CustomerId)!=null) {
            Integer CurrentSlotId=CustomerBooking.get(CustomerId);
            Pair<Integer,Integer> CurrentBookings=SlotBooking.get(CurrentSlotId);
            if( (CurrentBookings.first>=NewStartTime || NewEndTime<=CurrentBookings.second)
                    || (NewStartTime>=CurrentBookings.first && NewStartTime<=CurrentBookings.second)
                    || (NewEndTime>=CurrentBookings.first && NewEndTime<=CurrentBookings.second)) {
                    return false;
            }
        }
        return true;
    }

    @Override
    public void CheckIn(Integer InTime) {
        this.InTime=InTime;
        parkingSpace.CheckIn(InTime);
    }

    @Override
    public void CheckOut(Integer OutTime) {
        this.OutTime=OutTime;
        parkingSpace.CheckOut(OutTime);
    }

    @Override
    public void ProcessBooking(Integer CustomerId,Integer SlotId) {
        if(getAvailability(CustomerId,InTime,OutTime)) {
            CustomerBooking.put(CustomerId,SlotId);
            Pair<Integer,Integer> p=new Pair<>();
            p.first=InTime;
            p.second=OutTime;
            SlotBooking.put(SlotId,p);
            System.out.println(CustomerId+" Booked Successfully!!");
        }
        else {
            System.out.println("Slot not available");
        }
    }

}
