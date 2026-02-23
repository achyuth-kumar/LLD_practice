import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        User user=new User(1,"Achyuth");
        VehicleType twoWheeler=new TwoWheeler(new TwoWheelerSpace(),new HashMap<>(),new HashMap<>());
        twoWheeler.checkIn(4);
        twoWheeler.checkOut(7);
        twoWheeler.processBooking(1,1);
        twoWheeler.processPayment(80);

        System.out.println();
        twoWheeler.checkIn(8);
        twoWheeler.checkOut(10);
        twoWheeler.processBooking(2,1);
        twoWheeler.processPayment(80);

    }
}
