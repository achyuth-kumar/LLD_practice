public interface carService {
    public boolean getAvailability(Integer customerId,Integer seatId,Integer startTime,Integer endTime);
    public void processBooking(Integer customerId,Integer seatId,Integer startTime,Integer endTime);
    public void processPayment(Integer amount);
}
