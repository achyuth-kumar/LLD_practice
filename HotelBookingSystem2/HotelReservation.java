public interface HotelReservation {
    public boolean getAvailability(Integer CustomerID,Integer roomNo,Integer StartTime,Integer EndTime);
    public void processBooking(Integer CustomerID,Integer roomNo,Integer StartTime,Integer EndTime);
    public void processPayment(Integer amount);
}
