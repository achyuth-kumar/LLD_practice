public class TwoWheelerParkingSpace implements ParkingSpaceType{

    @Override
    public int GetCost(Vehicle vehicle,int InTime,int OutTime) {
        if(vehicle.equals(Vehicle.TWO_WHEELER)) {
            return (OutTime-InTime)*10;
        }
        System.out.println("Invalid Vehicle Type");
        return 0;
    }
}
