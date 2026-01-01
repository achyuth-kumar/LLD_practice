public interface ParkingSpaceType {
    public void CheckIn(Integer in);
    public void CheckOut(Integer out);
    public boolean GetAvailability();
    public Integer cost();
}
