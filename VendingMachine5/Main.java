public class Main {
    public static void main(String [] args) {
        State state=new State(1);
        VendingMachine vendingMachine=new VendingMachine();
        if(state.getStatus()==0) {
            System.out.println("Vending Machine is in Idle state");
        }
        else {
            System.out.println("Vending machine is in Working state");
            vendingMachine.InsertCoinAndChooseProduct(Coin.TWENTY,Item.PEPSI);
        }
    }
}
