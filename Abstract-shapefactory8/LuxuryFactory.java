public class LuxuryFactory implements Factory {
    public LuxuryFactory() {
    }
    @Override
    public int cost() {
        return 0;
    }
    public LuxuryFactory getLuxuryVehicle(String input) {
        if(input.equals("luxury1")) {
            return new LuxuryVehicleOne();
        }
        else if(input.equals("luxury2")) {
            return new LuxuryVehicleTwo();
        }
        else 
            return null;
    }
}