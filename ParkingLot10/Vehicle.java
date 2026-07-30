public interface Vehicle {
    public boolean getAvailability(Integer slotId,Integer startTime,Integer endTime);
    public void processBooking(Integer slotId,Integer startTime,Integer endTime);
    public void processPayment(Integer amount);
}
