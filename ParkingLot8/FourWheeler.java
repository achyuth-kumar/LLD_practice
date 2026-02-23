import java.util.HashMap;

public class FourWheeler implements VehicleType{
    Integer inTime,outTime,booked;
    ParkingSpace parkingSpace;
    HashMap<Integer,Integer> customerBooking;
    HashMap<Integer,Pair<Integer,Integer>> slotBooking;
    public FourWheeler(ParkingSpace parkingSpace, HashMap<Integer, Integer> customerBooking, HashMap<Integer, Pair<Integer, Integer>> slotBooking) {
        this.booked=0;
        this.parkingSpace = parkingSpace;
        this.customerBooking = customerBooking;
        this.slotBooking = slotBooking;
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
        if(getAvailability(customerId, slotNo, this.inTime, this.outTime)) {
            customerBooking.put(customerId,slotNo);
            slotBooking.put(slotNo,new Pair<>(inTime,outTime));
            this.booked=1;
            System.out.println(slotNo+" for "+customerId+" : booked successfully");
        }
        else {
            this.booked=0;
            System.out.println(slotNo+" : slot not available");
        }
    }

    @Override
    public void processPayment(Integer amount) {
        if(this.booked==1) {
            if(amount<this.cost()) {
                System.out.println("Insufficient amount");
                return ;
            }
            else if(amount>this.cost()){
                System.out.println("Lend back change : "+(amount-this.cost()));
            }
            System.out.println("Payments successful");
        }
        else {
            System.out.println("Booking is not successful, payments not accepted");
        }
    }
}
