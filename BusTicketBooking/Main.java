public class Main {
    public static void main(String [] args) {
        Customer customer = new Customer(new Booking(0,30,0));
        customer.getAvailability(0);
        customer.TicketBooking(0,150,0,1,5);
        customer.Accelerate(5);
        customer.TicketBooking(1,150,0,5,9);

    }
}
