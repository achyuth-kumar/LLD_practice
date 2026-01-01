import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        HashMap<Integer,Boolean> TwoWheelerSlots=new HashMap<>();
        for(int i=0;i<10;i++) {
            TwoWheelerSlots.put(i,false);
        }
        ParkingSpaceType parkingSpaceType=new TwoWheelerSpace(TwoWheelerSlots);
        if(parkingSpaceType.GetAvailability()) {
            VehicleFactory vehicleFactory = new VehicleFactory();
            Vehicle vehicle = vehicleFactory.CreateVehicle("twowheeler", parkingSpaceType);
            vehicle.CheckIn(1);
            vehicle.CheckOUt(5);
            System.out.println("TwoWheeler cost : "+parkingSpaceType.cost());
        }
        else {
            System.out.println("Slot not avialable");
        }

        HashMap<Integer,Boolean> FourWheelerSlots=new HashMap<>();
        for(int i=0;i<10;i++) {
            FourWheelerSlots.put(i,false);
        }
        parkingSpaceType=new FourWheelerSpace(FourWheelerSlots);
        if(parkingSpaceType.GetAvailability()) {
            VehicleFactory vehicleFactory = new VehicleFactory();
            Vehicle vehicle = vehicleFactory.CreateVehicle("fourwheeler", parkingSpaceType);
            vehicle.CheckIn(1);
            vehicle.CheckOUt(5);
            System.out.println("Four Wheeler cost : "+parkingSpaceType.cost());
        }
        else {
            System.out.println("Slot not avialable");
        }

    }

}
