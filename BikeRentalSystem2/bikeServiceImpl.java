import java.util.HashMap;

public class bikeServiceImpl implements bikeService{
    HashMap<Integer,Integer> customerBooking;
    HashMap<Integer,Pair<Integer,Integer>> seatBooking;
    Integer cost,booked;
    public bikeServiceImpl() {
        this.customerBooking = new HashMap<>();
        this.seatBooking=new HashMap<>();
        this.cost=0;
        this.booked=0;
    }
    @Override
    public boolean getAvailability(Integer customerId,Integer seatNo,Integer startTime,Integer endTime) {
        if(seatBooking.get(seatNo)==null) {
            return true;
        }
        if(seatBooking.get(seatNo)!=null) {
            Pair<Integer,Integer> currentBooking=seatBooking.get(seatNo);
            if((startTime>=currentBooking.first && endTime<=currentBooking.second) ||
                    (startTime>=currentBooking.first && startTime<=currentBooking.second) ||
                    (endTime>=currentBooking.first && endTime<=currentBooking.second)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void processBooking(Integer customerId,Integer seatNo,Integer startTime,Integer endTime) {
        if(getAvailability(customerId,seatNo,startTime,endTime)) {
            this.cost=(endTime-startTime)*10;
            this.booked=1;
            customerBooking.put(customerId,seatNo);
            seatBooking.put(seatNo,new Pair<>(startTime,endTime));
            System.out.println(customerId+" , "+seatNo+" : booked successfully");
        }
        else {
            System.out.println(seatNo+" : seat not available");
            this.booked=0;
        }
    }

    @Override
    public void processPayment(Integer customerId,Integer seatNo,Integer amount) {
        if(this.booked==1) {
            if(amount<cost) {
                System.out.println("Insufficient amount");
                return ;
            }
            else if(amount>cost) {
                System.out.println("Please lend back the change : "+(amount-cost));
            }
            System.out.println("Payment successful");
        }
        else {
            System.out.println("Payment is not accepted since booking is not yet confirmed");
        }
    }
}
