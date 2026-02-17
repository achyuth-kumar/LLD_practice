public interface VehicleType {
    public void checkIn(Integer inTime);
    public void checkOut(Integer outTime);
    public Integer cost();
    public boolean getAvailability(Integer customerId,Integer seatNo,Integer startTime,Integer endTime);
    public void processBooking(Integer customerId,Integer seatNo);
    public void processPayment(Integer amount);
}
