public class Vehiclefactory implements Factory {
    @Override
    public int cost() {
        return 0;
    }
    public Factory getFactory(String input) {
        if(input.equals("luxury")) {
            return new LuxuryFactory();
        }
        else if(input.equals("ordinary")) {
            return new OrdinaryFactory();
        }
        else 
            return null;
    }
}