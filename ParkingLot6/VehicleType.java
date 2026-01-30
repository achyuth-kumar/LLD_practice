public interface VehicleType {
    public void checkIn(Integer inTime);
    public void checkOut(Integer outTime);
    public Integer cost();
    public boolean getAvailability(Integer customerId,Integer slotId);
    public void processBooking(Integer customerId,Integer slotId);
    public void processPayment(Integer amount);
}
