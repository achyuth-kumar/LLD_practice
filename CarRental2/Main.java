public class Main {
    public static void main(String [] args) {
        Customer customer=new Customer(1,"Achyuth");
        Car car=new Car(1,123,"Suzuki");
        Driver driver=new Driver(1,"Kumar");
        carRentalService carRental=new carRentalServiceImpl();
        carRental.processBooking(1,1,4,9);
        carRental.processPayment(50);

        carRental.processBooking(2,1,10,12);
        carRental.processPayment(50);
    }
}
