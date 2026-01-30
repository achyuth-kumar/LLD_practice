public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth");
        VehicleType twoWheeler=new TwoWheeler(new TwoWheelerParkingSpace());
        twoWheeler.checkIn(4);
        twoWheeler.checkOut(9);
        twoWheeler.processBooking(user.getId(), 1);
        twoWheeler.processPayment(80);


        twoWheeler.checkIn(10);
        twoWheeler.checkOut(11);
        twoWheeler.processBooking(2, 1);
        twoWheeler.processPayment(80);

    }
}
