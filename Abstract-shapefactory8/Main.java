public class Main {
    public static void main(String args[]) {
        Vehiclefactory vehicleFactory=new Vehiclefactory();
        LuxuryFactory factory= (LuxuryFactory) vehicleFactory.getFactory("luxury");
        LuxuryVehicleOne luxuryVehicleOne= (LuxuryVehicleOne) factory.getLuxuryVehicle("luxury1");
        System.out.println("Luxury Vehicle-one cost : "+luxuryVehicleOne.cost());
        LuxuryVehicleTwo luxuryVehicleTwo= (LuxuryVehicleTwo) factory.getLuxuryVehicle("luxury2");
        System.out.println("Luxury Vehicle-two cost : "+luxuryVehicleTwo.cost());

        OrdinaryFactory ordinaryFactory= (OrdinaryFactory) vehicleFactory.getFactory("ordinary");
        OrdinaryVehicleOne ordinaryVehicleOne=(OrdinaryVehicleOne) ordinaryFactory.getOrdinaryVehicle("ordinary1");
        System.out.println("Ordinary Vehicle-one cost : "+ordinaryVehicleOne.cost());
        OrdinaryVehicleTwo ordinaryVehicleTwo=(OrdinaryVehicleTwo) ordinaryFactory.getOrdinaryVehicle("ordinary2");
        System.out.println("Ordinary Vehicle-two cost : "+ordinaryVehicleTwo.cost());

        // Vehicle luxuryVehicle=vechileFactory.getLuxuryVehicle("luxury1");
        // System.out.println("luxury cost : "+luxuryVehicle.cost());
    }
}