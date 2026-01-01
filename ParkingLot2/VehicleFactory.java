public class VehicleFactory {
    public Vehicle CreateVehicle(String input,ParkingSpaceType parkingSpaceType) {
        if(input.equals("twowheeler")) {
            return new TwoWheeler(parkingSpaceType);
        }
        else if(input.equals("fourwheeler")) {
            return new FourWheeler(parkingSpaceType);
        }
        return null;
    }

}

