public class Main {
    public static void main(String [] args) {
        VehicleType TwoWheelerVehicle=new TwoWheeler(1,"Jupiter",new TwoWheelerParkingSpace());
        TwoWheelerVehicle.checkIn(1);
        TwoWheelerVehicle.chechOut(5);
        TwoWheelerVehicle.cost();

        VehicleType FourWheelerVehicle=new FourWheeler(1,"Scorpir",new FourWheelerParkingSpace());
        FourWheelerVehicle.checkIn(1);
        FourWheelerVehicle.chechOut(5);
        FourWheelerVehicle.cost();

    }
}
