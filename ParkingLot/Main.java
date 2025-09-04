public class Main {
    public static  void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        TwoWheelerVehicle twoWheelerVehicle=(TwoWheelerVehicle) vehicle.getType(2);
        if(twoWheelerVehicle!=null) {
            twoWheelerVehicle.checkIn(2);
            twoWheelerVehicle.checkOut(5);
            System.out.println("cost : " + twoWheelerVehicle.cost());
        }
        else {
            System.out.println("Wrong parking space for 2 wheeler ");
        }

        FourWheelerVehicle fourWheelerVehicle=(FourWheelerVehicle)  vehicle.getType(4);
        if(fourWheelerVehicle!=null) {
            fourWheelerVehicle.checkIn(2);
            fourWheelerVehicle.checkOut(7);
            System.out.println("cost : " + fourWheelerVehicle.cost());
        }
        else {
            System.out.println("Wrong parking space for 4 wheeler");
        }
    }
}
