public class Main {
    public static void main(String [] args) {
        Coin coin=Coin.TWENTY;
        Item item=Item.SPRITE;
        VendingMachine vendingMachine=new IdleStateImpl();
        vendingMachine.InsertCoin(coin);

        vendingMachine=new HasMoneyStateImpl();
        vendingMachine.InsertCoin(coin);

        vendingMachine=new WorkingStateImpl();
        if(vendingMachine.ValidateProduct(coin,item)) {
            vendingMachine=new DisepenseStateImpl();
            vendingMachine.DispenseItem(item);
        }

    }
}
