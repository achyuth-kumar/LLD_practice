public interface carRentalService {
    public boolean getAvailability(Integer customerId,Integer seatNo,Integer startTime,Integer endTime);
    public void processBooking(Integer customerId,Integer seatNo,Integer startTime,Integer endTime);
    public void processPayment(Integer amount);
}
