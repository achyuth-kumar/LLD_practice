public class Main {
    public static void main(String [] args) {
        Item item=Item.PEPSI;
        Coin coin=Coin.TWENTY;
        VendingMachine vendingMachine=new IdleStateImpl();
        vendingMachine.InsertCoin(coin);

        vendingMachine=new HasMoneyStateImpl();
        vendingMachine.InsertCoin(coin);

        vendingMachine=new WorkingStateImpl();
        vendingMachine.ChooseProduct(item);
        if(vendingMachine.ValidateProduct(coin,item)) {
            vendingMachine=new DispenseStateImpl();
            vendingMachine.DispenseItem(item);
        }
    }
}
