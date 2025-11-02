public class Main {
    public static void main(String [] args) {
        Coin coin=Coin.TWENTY;
        Item item=Item.PEPSI;
        VendingMachine vendingMachine=new IdleStateImpl();
        vendingMachine.InsertCoin(coin);

        vendingMachine=new HasMoneyStateImpl();
        vendingMachine.InsertCoin(coin);

        vendingMachine=new WorkingStateImpl();
        vendingMachine.ChooseProduct(item);
        boolean validate=vendingMachine.validateProduct(coin,item);
        if(validate) {
            vendingMachine=new DispenseStateImpl();
            vendingMachine.DispenseItem(item);
        }

    }
}
