public interface VehicleType {
    public void CheckIn(Integer InTime);
    public void CheckOut(Integer OutTime);
    public boolean getAvailability(Integer CustomerId,Integer NewStartTime,Integer NewEndTime);
    public void ProcessBooking(Integer CustomerId,Integer SlotId);
}
