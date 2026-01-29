public class Main {
    public static void main(String[] args) {
        Bike bike=new Bike(1,"Yamaha");
        Customer customer=new Customer(1,"Achyuth");
        Rider rider=new Rider(1,"Kumar");
        bikeService bikeRental=new bikeServiceImpl();
        bikeRental.processBooking(1,1,4,9);
        bikeRental.processPayment(1, 1,50);

        bikeRental.processBooking(2,1,2,3);
        bikeRental.processPayment(2,1,50);

        bikeRental.processBooking(3,1,6,10);
        bikeRental.processPayment(3,1,50);

    }
}
