import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        Customer customer1=new Customer(0,"Achyuth");
        Ride ride=new Ride(0,10);
        List<Integer> rides1=new ArrayList<>();
        rides1.add(1);
        rides1.add(5);
        ride.ProcessBooking(customer1.getId(),0,rides1);
        ride.GetPaymentStatus(20);


        Customer customer2=new Customer(1,"Kumar");
        List<Integer> rides2=new ArrayList<>();
        rides2.add(6);
        rides2.add(8);
        ride.ProcessBooking(customer2.getId(),0,rides2);
        ride.GetPaymentStatus(30);


    }
}
