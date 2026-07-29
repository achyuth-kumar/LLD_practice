import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        User user1=new User(1,"Achyuth");
        Vehicle vehicle=new TwoWheeler(user1.getId(),new HashMap<>(),false,new TwoWheelerSpace());
        vehicle.processBooking(1,1,4);
        vehicle.processPayment(50);
        System.out.println();

        User user2=new User(2,"Kumar");
        vehicle.processBooking(1,5,9);
        vehicle.processPayment(50);


    }
}
