import java.util.HashMap;

public class TwoWheelerParking implements ParkingSpaceType{
    public int inTime,outTime;
    HashMap<String,Integer> vehicles;
    public TwoWheelerParking() {
        this.vehicles = new HashMap<>();
    }

    @Override
    public boolean validate(VehicleType type) {
        return (type==VehicleType.TWO_WHEELER);
    }

    @Override
    public void checkIn(int inTime,String vehicleNo,VehicleType type) {
        if(validate(type)) {
            this.inTime = inTime;
            System.out.println(vehicleNo + " : checkedIn at : " + inTime);
        }
        else {
            System.out.println("You've entered wrong parking space");
        }
    }

    @Override
    public void checkOut(int outTime,String vehicleNo) {
        if(inTime>0) {
            this.outTime = outTime;
            System.out.println(vehicleNo + " : checkedOut at : " + outTime);
        }
        else {
            System.out.println(vehicleNo+" : Didn't checkedIn");
        }
    }

    @Override
    public int cost(String vehicleNo) {
        int parkingcost=(this.outTime-this.inTime)*10;
        vehicles.put(vehicleNo,parkingcost);
        return vehicles.get(vehicleNo);
    }
}
