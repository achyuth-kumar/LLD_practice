public class Main {
    public static void main(String [] args) {
        User user1=new User(1,"Achyuth");
        VehicleType vehicle=new TwoWheeler(new TwoWheelerSpace());
        vehicle.processBooking(user1.getId(),1,4,6);
        vehicle.processPayment(30);

        User user2=new User(2,"Kumar");
        vehicle.processBooking(user2.getId(),2,4,6);
        vehicle.processPayment(30);

    }
}
