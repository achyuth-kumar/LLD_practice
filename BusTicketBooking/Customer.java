public class Customer {
    Booking booking;
    Customer(Booking booking) {
        this.booking=booking;
    }
    public Boolean getAvailability(int SeatNo) {
        return booking.getAvailability(SeatNo);
    }
    public void TicketBooking(int CustomerId,int amount,int SeatNo,int CustomerSource,int CustomerDestination) {
        booking.TicketBooking(CustomerId,amount,SeatNo,CustomerSource,CustomerDestination);
    }
    public void Accelerate(int speed) {
        booking.Accelerate(speed);
    }
}
