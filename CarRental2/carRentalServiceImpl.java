import java.util.HashMap;

public class carRentalServiceImpl implements carRentalService{
    HashMap<Integer,Integer> customerBooking;
    HashMap<Integer,Pair<Integer,Integer>> seatBooking;
    Integer cost,booked;
    public carRentalServiceImpl() {
        this.cost = 0;
        this.booked = 0;
        this.customerBooking=new HashMap<>();
        this.seatBooking=new HashMap<>();
    }

    @Override
    public boolean getAvailability(Integer customerId, Integer seatNo, Integer startTime, Integer endTime) {
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
    public void processBooking(Integer customerId, Integer seatNo, Integer startTime, Integer endTime) {
        if(getAvailability(customerId,seatNo,startTime,endTime)) {
            System.out.println(customerId+" , "+seatNo+" : booked successfully");
            customerBooking.put(customerId,seatNo);
            seatBooking.put(seatNo,new Pair<>(startTime,endTime));
            this.cost=(endTime-startTime)*10;
            this.booked=1;
        }
        else {
            this.booked=0;
            System.out.println(seatNo+" : seat is not available");
        }
    }

    @Override
    public void processPayment(Integer amount) {
        if(this.booked==1) {
            if(amount<cost) {
                System.out.println("Insufficient amount");
                return ;
            }
            else if(amount>cost) {
                System.out.println("lend back change : "+(amount-cost));
            }
            System.out.println("Payment successful");
        }
        else {
            System.out.println("Payment is not accepted, since booking is falied");
        }
    }
}
