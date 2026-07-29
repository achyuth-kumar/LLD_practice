public interface Vehicle {
    public boolean getAvailability(Integer slotID,Integer startTime,Integer endTime);
    public void processBooking(Integer slotID,Integer startTime,Integer endTime);
    public void processPayment(Integer amount);
}
