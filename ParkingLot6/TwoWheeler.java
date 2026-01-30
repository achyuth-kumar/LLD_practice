import java.util.HashMap;

public class TwoWheeler implements VehicleType{
    Integer inTime,outTime,cost,booked;
    ParkingSpacetype parkingSpacetype;
    HashMap<Integer,Integer> customerBooking;
    HashMap<Integer,Pair<Integer,Integer>> slotBooking;
    public TwoWheeler(ParkingSpacetype parkingSpacetype) {
        this.parkingSpacetype = parkingSpacetype;
        this.cost=0;
        this.booked=0;
        this.customerBooking=new HashMap<>();
        this.slotBooking=new HashMap<>();
    }


    @Override
    public void checkIn(Integer inTime) {
        this.inTime=inTime;
        parkingSpacetype.checkIn(inTime);
    }

    @Override
    public void checkOut(Integer outTime) {
        this.outTime=outTime;
        parkingSpacetype.checkOut(outTime);
    }

    @Override
    public Integer cost() {
        return parkingSpacetype.cost();
    }

    @Override
    public boolean getAvailability(Integer customerId,Integer slotId) {
        if(slotBooking.get(slotId)==null) {
            return true;
        }
        if(slotBooking.get(slotId)!=null) {
            Pair<Integer,Integer> currentBooking=slotBooking.get(slotId);
            if( (inTime>=currentBooking.first && outTime<=currentBooking.second) ||
                    (inTime>=currentBooking.first && inTime<=currentBooking.second)||
                    (outTime>=currentBooking.first && outTime<=currentBooking.second)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void processBooking(Integer customerId,Integer slotId) {
        if(getAvailability(customerId,slotId)) {
            customerBooking.put(customerId,slotId);
            slotBooking.put(slotId,new Pair<>(inTime,outTime));
            System.out.println(customerId+" , "+slotId+" : Booking confirmed");
            this.booked=1;
        }
        else {
            this.booked=0;
            System.out.println(slotId+" : slot not available");
        }
    }

    @Override
    public void processPayment(Integer amount) {
        Integer parkingCost=this.cost();
        if(this.booked==1) {
            System.out.println("Estimated cost : "+parkingCost);
            if(amount<parkingCost) {
                System.out.println("Insufficient amount");
                return ;
            }
            else if(amount>parkingCost){
                System.out.println("Please lend back the change : "+(amount-parkingCost));
            }
            System.out.println("Payment successful");
        }
        else {
            System.out.println("Payments not accepted since booking is not confirmed");
        }
    }
}
