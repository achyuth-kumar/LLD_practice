import java.util.HashMap;

public class TwoWheeler implements VehicleType{
    Integer inTime,outTime,cost;
    HashMap<Integer,Integer> customerBooking=new HashMap<>();
    HashMap<Integer,Pair<Integer,Integer>> SlotBooking=new HashMap<>();
    ParkingSpace parkingSpace;
    boolean booked;
    public TwoWheeler(ParkingSpace parkingSpace) {
        this.booked=false;
        this.parkingSpace = parkingSpace;
    }

    @Override
    public void checkIn(Integer inTime) {
        this.inTime=inTime;
        parkingSpace.checkIn(inTime);
    }

    @Override
    public void checkOut(Integer outTime) {
        this.outTime=outTime;
        parkingSpace.checkOut(outTime);
    }

    @Override
    public void cost() {
        this.cost=parkingSpace.cost();
        System.out.println("cost : "+cost);
    }

    @Override
    public boolean getAvailability(Integer customerId,Integer slotId,Integer starTime,Integer endTime) {
        if(SlotBooking.get(slotId)==null) {
            return true;
        }
        if(SlotBooking.get(slotId)!=null) {
            Pair<Integer,Integer> currentBooking=SlotBooking.get(slotId);
            if((starTime>=currentBooking.first && endTime<=currentBooking.second)
            || (starTime>=currentBooking.first && starTime<=currentBooking.second)
                ||(endTime>=currentBooking.first && endTime<=currentBooking.second)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void processBooking(Integer customerId,Integer slotId,Integer startTime,Integer endTime) {
        checkIn(startTime);
        checkOut(endTime);
        if(getAvailability(customerId,slotId,startTime,endTime)) {
            customerBooking.put(customerId,slotId);
            SlotBooking.put(slotId,new Pair<>(startTime,endTime));
            System.out.println(customerId+" , "+slotId+" , Booked successfully");
            this.booked=true;
            return ;
        }
        else {
            this.booked=false;
            System.out.println(customerId+" , "+slotId+" , Slot not available");
        }
    }

    @Override
    public void processPayment(Integer amount) {
        if(this.booked) {
            cost();
            if (amount < this.cost) {
                System.out.println("Insuffcient amount!!");
                return;
            } else if (amount > this.cost) {
                System.out.println("Please lend back change : " + (amount - this.cost));
            }
            System.out.println("Payment successfully");
        }
        else{
            System.out.println("Booking is not successfully, so no payments are accepted");
        }
    }
}
