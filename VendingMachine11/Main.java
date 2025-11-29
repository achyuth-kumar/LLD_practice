public class Main {
    public static void main(String [] args) {
        Item item=Item.SPRITE;
        Coin coin=Coin.TWENTY;
        VendingMachine vendingMachine=new IdleStateServiceImpl();
        vendingMachine.insertCoin(coin);

        vendingMachine=new HasMoneyStateServiceImpl();
        vendingMachine.insertCoin(coin);

        vendingMachine=new WorkingStateServiceImpl();
        if(vendingMachine.validateProduct(coin,item)) {
            vendingMachine=new DispenseStateServiceImpl();
            vendingMachine.dispenseItem(item);
        }

    }
}

