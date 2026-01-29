public interface bikeService {
    public boolean getAvailability(Integer customerId,Integer seatno,Integer startTime,Integer endTime);
    public void processBooking(Integer customerId,Integer seatno,Integer startTime,Integer endTime);
    public void processPayment(Integer customerId,Integer seatNo,Integer amount);
}
