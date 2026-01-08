public interface ParkingSpace {
    public void CheckIn(Integer InTime);
    public void CheckOut(Integer OutTime);
    public Integer cost();
}
