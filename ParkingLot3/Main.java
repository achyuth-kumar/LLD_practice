public class Main {
    public static void main(String [] args) {
        VehicleType TwoWheeler=new TwoWheeler(new TwoWheelerParkingSpace());
        TwoWheeler.CheckIn(1);
        TwoWheeler.CheckOut(5);
        TwoWheeler.ProcessBooking(1,1);

        TwoWheeler.CheckIn(6);
        TwoWheeler.CheckOut(10);
        TwoWheeler.ProcessBooking(1,1);

    }
}
