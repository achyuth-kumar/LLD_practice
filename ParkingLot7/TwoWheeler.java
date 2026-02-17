import java.util.HashMap;

public class TwoWheeler implements VehicleType{

    ParkingSpace parkingSpace;
    Integer booked,inTime,outTime;
    HashMap<Integer,Integer> customerBooking;
    HashMap<Integer,Pair<Integer,Integer>> slotBooking;
    public TwoWheeler(ParkingSpace parkingSpace) {
        this.booked=0;
        this.parkingSpace = parkingSpace;
        this.customerBooking=new HashMap<>();
        this.slotBooking=new HashMap<>();
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
    public Integer cost() {
        return parkingSpace.cost();
    }

    @Override
    public boolean getAvailability(Integer customerId,Integer slotNo,Integer startTime,Integer endTime) {
        if(slotBooking.get(slotNo)==null) {
            return true;
        }
        if(slotBooking.get(slotNo)!=null) {
            Pair<Integer,Integer> currentBooking=slotBooking.get(slotNo);
            if((startTime>=currentBooking.first && endTime<=currentBooking.second) ||
                    (startTime>=currentBooking.first && startTime<=currentBooking.second) ||
                    (endTime>=currentBooking.first && endTime<=currentBooking.second)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void processBooking(Integer customerId,Integer slotNo) {
        Integer startTime=inTime,endTime=outTime;
        if(getAvailability(customerId,slotNo,startTime,endTime)) {
            System.out.println(customerId+" , "+slotNo+" : booked successfully");
            customerBooking.put(customerId,slotNo);
            slotBooking.put(slotNo,new Pair<>(startTime,endTime));
            this.booked=1;
        }
        else {
            this.booked=0;
            System.out.println(slotNo+" : Slot not available");
        }
    }

    @Override
    public void processPayment(Integer amount) {
        if(this.booked==1) {
            if(amount<this.cost()) {
                System.out.println("Insufficient amount");
                return ;
            }
            else if(amount>this.cost()) {
                System.out.println("Lend back change : "+(amount-this.cost()));
            }
            System.out.println("Payment Successful");
        }
        else {
            System.out.println("Payment is not accepted, since booking failed");
        }
    }
}
