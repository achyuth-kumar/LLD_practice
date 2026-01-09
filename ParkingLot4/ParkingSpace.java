public interface ParkingSpace {
    public void CheckIn(Integer inTime);
    public void CheckOut(Integer outTime);
    public Integer Cost();
}
