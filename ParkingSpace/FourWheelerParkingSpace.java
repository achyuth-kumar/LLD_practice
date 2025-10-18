public class FourWheelerParkingSpace implements ParkingSpaceType{

    @Override
    public int GetCost(Vehicle vehicle,int InTime,int OutTime) {
        if(vehicle.equals(Vehicle.FOUR_WHEELER)) {
            return (OutTime-InTime)*15;
        }
        System.out.println("Invalid Vehicle Type");
        return 0;
    }
}
