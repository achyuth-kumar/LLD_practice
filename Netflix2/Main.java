import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth");
        Booking booking=new Booking(1,null);
        NetflixService netflixService=new NetflixServiceImpl();
        netflixService.processBooking(user.getId(),1, LocalDateTime.now(),LocalDateTime.now().plusDays(30));
        netflixService.processPayment(300);


        netflixService.processBooking(user.getId(),1,LocalDateTime.now().plusDays(31),LocalDateTime.now().plusDays(40));
        netflixService.processPayment(300);
    }
}
