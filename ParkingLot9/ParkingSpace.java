public interface ParkingSpace {
    public void checkIn(Integer inTime);
    public void checkOut(Integer outTime);
    public Integer cost();
}
