public class Main {
    public static void main(String [] args) {
        Customer customer=new Customer(1,"Achyuth");
        VehicleType twoWheeler=new TwoWheeler(new TwoWheelerSpace());
        twoWheeler.checkIn(4);
        twoWheeler.checkOut(6);
        twoWheeler.processBooking(customer.getId(), 1);
        twoWheeler.processPayment(50);


        twoWheeler.checkIn(1);
        twoWheeler.checkOut(3);
        twoWheeler.processBooking(2, 1);
        twoWheeler.processPayment(50);
    }
}
