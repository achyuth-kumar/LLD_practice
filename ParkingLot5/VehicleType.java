public interface VehicleType {
    public void checkIn(Integer inTime);
    public void checkOut(Integer outTime);
    public void cost();
    public boolean getAvailability(Integer customerId,Integer slotId,Integer starTime,Integer endTime);
    public void processBooking(Integer customerId,Integer slotId,Integer startTime,Integer outTime);
    public void processPayment(Integer amount);
}
