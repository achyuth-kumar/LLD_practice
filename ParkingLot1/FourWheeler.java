public class FourWheeler implements Vehicle {
    public int inTime,outTime;
    ParkingSpaceType parkingSpaceType;
    public FourWheeler(ParkingSpaceType parkingSpaceType) {
        this.inTime = inTime;
        this.outTime = outTime;
        this.parkingSpaceType=parkingSpaceType;
    }

    @Override
    public void checkIn(int inTime,String vehicleNo,VehicleType type) {
        System.out.println(vehicleNo+" : Got checkedIn");
        parkingSpaceType.checkIn(inTime,vehicleNo,type);
    }

    @Override
    public void checkOut(int outTime,String vehicleNo) {
        System.out.println(vehicleNo+" : Got checkedOut");
        parkingSpaceType.checkOut(outTime,vehicleNo);
    }
    @Override
    public void cost(String vehicleNo) {
        System.out.println("cost : "+parkingSpaceType.cost(vehicleNo));
    }

}
