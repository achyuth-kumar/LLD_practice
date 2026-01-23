import java.util.HashMap;

public class NetflixBookingServiceImpl implements NetflixBooking{
    Integer cost,booked;
    HashMap<Integer,Integer> userBooking=new HashMap<>();
    HashMap<Integer,Pair<Integer,Integer>> netFlixBooking=new HashMap<>();
    @Override
    public boolean getAvailability(Integer userId,Integer netflixId,Integer startTime,Integer endTime) {
        if(netFlixBooking.get(netflixId)==null) {
            return true;
        }
        if(netFlixBooking.get(netflixId)!=null) {
            Pair<Integer,Integer> currentBooking=netFlixBooking.get(netflixId);
            if((startTime>=currentBooking.first && endTime<=currentBooking.second) ||
                    (startTime>=currentBooking.first && startTime<=currentBooking.second) ||
                    (endTime>=currentBooking.first && endTime<=currentBooking.second)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void processBooking(Integer userId,Integer netflixId,Integer startTime,Integer endTime) {
        if(getAvailability(userId,netflixId,startTime,endTime)) {
            this.booked=1;
            this.cost=(endTime-startTime)*10;
            userBooking.put(userId,netflixId);
            netFlixBooking.put(netflixId,new Pair<>(startTime,endTime));
            System.out.println(userId+" , "+netflixId+" ; booked successfully");
        }
        else {
            this.booked=0;
            System.out.println(userId+" , "+netflixId+" : account is already having active netflix");
        }
    }

    @Override
    public void processPayment(Integer amount) {
        if(this.booked==1) {
            if(amount<cost) {
                System.out.println("Insufficient amount");
                return ;
            }
            System.out.println("payment successful");
        }
        else {
            System.out.println("Netflix Booking is not successful, to proceed with payment");
        }
    }
}
