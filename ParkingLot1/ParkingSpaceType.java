public interface ParkingSpaceType {
    public boolean validate(VehicleType type);
    public void checkIn(int inTime,String vehicleNo,VehicleType type);
    public void checkOut(int outTime,String vehicleNo);
    public int cost(String vehicleNo);
}
