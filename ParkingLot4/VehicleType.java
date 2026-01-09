public interface VehicleType {
    public void CheckIn(Integer inTime);
    public void CheckOut(Integer outTime);
    public boolean GetAvailability(Integer CustomerId,Integer SlotId);
    public void ProcessBooking(Integer CustomerId,Integer SlotId);
    public void ProcessPayment(Integer amount);
}
