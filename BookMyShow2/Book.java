import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Book {
    public HashMap<Integer,List<Integer>> MovieAvailability=new HashMap<>();
    public HashMap<Integer,Integer> CustomerBooking=new HashMap<>();
    public HashMap<Integer,Integer> SeatBooking=new HashMap<>();
    public Integer price=150;
    Book() {
        int n=2;
        List<Integer> movies=new ArrayList<>();
        movies.add(10);
        movies.add(20);
        movies.add(30);
        for(int i=0;i<n;i++) {
            MovieAvailability.put(i,movies);
        }
        int seats=10;
        for(int i=0;i<seats;i++) {
            SeatBooking.put(i,-1);
        }
    }

    public boolean getAvailability(Integer theatreId,Integer movieId) {
        if(MovieAvailability.containsKey(theatreId)) {
            List<Integer> AvailabileMovies = MovieAvailability.get(theatreId);
            if(AvailabileMovies.contains(movieId)) {
                return true;
            }
        }
        return false;
    }
    public boolean getSeatAvailability(Integer SeatNo) {
        if(SeatBooking.get(SeatNo)==-1) {
            return true;
        }
        return false;
    }

    public void ProcessBooking(Integer CustomerId,Integer SeatNo,Integer MovieId,Integer TheatreId) {
        if(getAvailability(TheatreId,MovieId) && getSeatAvailability(SeatNo)){
            CustomerBooking.put(CustomerId,SeatNo);
            SeatBooking.put(SeatNo,MovieId);
            System.out.println("MovieID : "+MovieId+" : have booked successfully");
        }
        else {
            System.out.println("Movie not available for customer : "+CustomerId);
        }
    }
    public void CheckPaymentStatus(Integer amount) {
        if(amount>price) {
            System.out.println("please lend back change : "+(amount-price));
        }
        else if(amount==price) {
            System.out.println("Payment successful");
        }
        else
            System.out.println("Payment failed");
    }
}
