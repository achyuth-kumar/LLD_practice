import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new TwoWheeler(new HashMap<>(),false,new TwoWheelerSpace());
        vehicle.processBooking(1,1,4);
        vehicle.processPayment(50);
        System.out.println();
        vehicle.processBooking(1,5,7);
        vehicle.processPayment(50);

    }
}
