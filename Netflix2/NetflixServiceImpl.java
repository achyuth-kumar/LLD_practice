import java.time.LocalDateTime;
import java.util.HashMap;

public class NetflixServiceImpl implements NetflixService{
    HashMap<Integer,Integer> UserBooking;
    HashMap<Integer,Pair<LocalDateTime,LocalDateTime>>  AccountBooking;
    Integer cost;
    Integer booked;
    public NetflixServiceImpl() {
        this.cost = 0;
        this.booked = 0;
        this.UserBooking=new HashMap<>();
        this.AccountBooking=new HashMap<>();
    }

    @Override
    public boolean getAvailability(Integer userId,Integer accountId,LocalDateTime startTime,LocalDateTime endTime) {
        if(AccountBooking.get(accountId)==null) {
            return true;
        }

        if(AccountBooking.get(accountId)!=null) {
            Pair<LocalDateTime,LocalDateTime> currentBooking=AccountBooking.get(accountId);
            if((startTime.isAfter(currentBooking.first) && endTime.isBefore(currentBooking.second)) ||
                    (startTime.isAfter(currentBooking.first) && startTime.isBefore(currentBooking.second)) ||
                    (endTime.isAfter(currentBooking.first) && endTime.isBefore(currentBooking.second))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void processBooking(Integer userId, Integer accountId, LocalDateTime startTime, LocalDateTime endTime) {
        if(getAvailability(userId,accountId,startTime,endTime)) {
            System.out.println("User : "+userId+" , Account : "+ accountId+" : booked successfully");
            UserBooking.put(userId,accountId);
            AccountBooking.put(accountId,new Pair<>(startTime,endTime));
            this.cost=startTime.compareTo(endTime)*100;
            this.booked=1;
        }
        else {
            this.booked=0;
            System.out.println(accountId+" : Account is already having active Netflix Subscription");
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
                System.out.println("Lend back change : "+(amount-cost));
            }
            System.out.println("Payment successful");
        }
        else {
            System.out.println("Payment is not accepted, since booking is not yet confirmed");
        }
    }
}
