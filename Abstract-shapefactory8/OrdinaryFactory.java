public class OrdinaryFactory implements Factory {
    @Override
    public int cost() {
        return 0;
    }
    public OrdinaryFactory getOrdinaryVehicle(String input) {
        if(input.equals("ordinary1")) {
            return new OrdinaryVehicleOne();
        }
        else if(input.equals("ordinary2")) {
            return new OrdinaryVehicleTwo();
        }
        else 
            return null;
    }
}