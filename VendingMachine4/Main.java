public class Main {
    public static void main(String [] args) {
        State state=new State(1);
        if(state.getStatus()==0) {
            System.out.println("Vending Machine is in idle state");
        }
        else {
            System.out.println("vending Machine is in working state");
            VendingMachine vendingMachine = new VendingMachineServiceImpl();
            vendingMachine.InsertCoinAndChooseProduct(Coin.FIVE,Item.SPRITE);
        }
    }
}
