public class Main {
    public static void main(String [] args) {
        VehicleType twoWheeler=new TwoWheeler(new TwoWheelerParkingSpace());
        twoWheeler.CheckIn(1);
        twoWheeler.CheckOut(5);
        twoWheeler.ProcessBooking(1,1);
        twoWheeler.ProcessPayment(40);

        twoWheeler.CheckIn(6);
        twoWheeler.CheckOut(10);
        twoWheeler.ProcessBooking(1,1);
        twoWheeler.ProcessPayment(40);

    }
}
