public class VendingMachine {
    public States getStateObject(String type) {
        if(type.equals("idle")){
            return new IdleState();
        }
        return new WorkingState();
    }

}
