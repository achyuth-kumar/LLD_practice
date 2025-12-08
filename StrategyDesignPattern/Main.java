public class Main {
    public static void main(String [] args) {
        Vehicle bicycle=new Bicycle();
        System.out.println("Bicycle : "+bicycle.getNumberOfWheels());
        EngineVehicle bike=new Bike();
        EngineVehicle car=new Car();
        System.out.println("Bike : "+bike.hasEngine());
        System.out.println("Car : "+car.hasEngine());
    }
}
