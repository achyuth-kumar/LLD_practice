public interface Vehicle {
    public void checkIn(int inTime,String vehicleNo,VehicleType type);
    public void checkOut(int outTime,String vehicleNo);
    public void cost(String vehicleNo);
}
