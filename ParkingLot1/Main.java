public class Main {
    public static void main(String [] args) {
//        Vehicle vehicle=new TwoWheeler(new TwoWheelerParking());
        Vehicle vehicle=new FourWheeler(new FourWheelerParking());
        Driver driver=new Driver(1,"Kumar");
        vehicle.checkIn(2,"1234",VehicleType.FOUR_WHEELER);
        vehicle.checkOut(5,"1234");
        vehicle.cost("1234");
    }
}
