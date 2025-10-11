public class Main {
    public static void main(String [] args) {
        State state=new StateImpl(true);
        if(!state.getStatus()) {
                System.out.println("System is in Idle state");
        }
        else {
            System.out.println("System is in working state");
            VendingMachine vendingMachine=new VendingMachineImpl();
            vendingMachine.insertAndSelectProduct(Coin.TWENTY,Item.COKE);
        
        }
    }
}
