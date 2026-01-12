public interface HotelReservation {
    public boolean getAvailability(Integer roomNo,Integer CustomerId,Integer StartTime,Integer EndTime);
    public void processBooking(Integer roomNo,Integer CustomerId,Integer StartTime,Integer EndTime);
    public void processPayment(Integer amount);
}
