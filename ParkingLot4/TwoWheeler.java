import java.util.HashMap;

public class TwoWheeler implements VehicleType{


    HashMap<Integer,Integer> CustomerBooking;
    HashMap<Integer,Pair<Integer,Integer>> SlotBooking;
    Integer intime,outTime;
    ParkingSpace parkingSpace;
    public TwoWheeler(ParkingSpace parkingSpace) {
        this.CustomerBooking = new HashMap<>();
        this.SlotBooking = new HashMap<>();
        this.parkingSpace=parkingSpace;
    }

    @Override
    public void CheckIn(Integer inTime) {
        this.intime=inTime;
        parkingSpace.CheckIn(inTime);
    }

    @Override
    public void CheckOut(Integer outTime) {
        this.outTime=outTime;
        parkingSpace.CheckOut(outTime);
    }

    @Override
    public boolean GetAvailability(Integer CustomerId,Integer SlotId) {
        if(CustomerBooking.get(CustomerId)==null) {
            return true;
        }
        if(CustomerBooking.get(CustomerId)!=null) {
            Integer CurrentSlotId=CustomerBooking.get(CustomerId);
            Pair<Integer,Integer> CurrentSlotBooking=SlotBooking.get(CurrentSlotId);
            if((intime>=CurrentSlotBooking.first && outTime<=CurrentSlotBooking.second)
             ||(intime>=CurrentSlotBooking.first && intime<=CurrentSlotBooking.second) ||
                    (outTime>=CurrentSlotBooking.first && outTime<=CurrentSlotBooking.second)){
                return false;
            }
        }
        return true;
    }

    @Override
    public void ProcessBooking(Integer CustomerId,Integer SlotId) {
        if(GetAvailability(CustomerId,SlotId)) {
            CustomerBooking.put(CustomerId,SlotId);
            Pair<Integer,Integer> p=new Pair<>();
            p.first=intime;
            p.second=outTime;
            SlotBooking.put(SlotId,p);
            System.out.println(CustomerId+" : "+SlotId+" : Booked successfully!!");
        }
        else {
            System.out.println("Slot not Available");
        }
    }

    @Override
    public void ProcessPayment(Integer amount) {
        Integer cost= parkingSpace.Cost();
        if(amount<cost) {
            System.out.println("Insufficnent amount");
            return ;
        }
        else if(amount>cost){
            System.out.println("plese lend back change : "+(amount-cost));
        }
        System.out.println("Thanks Visit Agian");
    }
}
