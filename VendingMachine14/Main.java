import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        VendingMachine vendingMachine=new IdleStateServiceImpl();
        Coin coin=Coin.TWENTY;
        Item item=Item.PEPSI;
        HashMap<Item,Integer> prices=new HashMap<>();
        prices.put(Item.COKE,Coin.FIVE.getValue());
        prices.put(Item.PEPSI,Coin.TEN.getValue());
        prices.put(Item.SPRITE,Coin.TWENTY.getValue());
        vendingMachine.insertCoin(coin);

        vendingMachine=new HasMoneyStateServiceImpl();
        vendingMachine.insertCoin(coin);

        vendingMachine=new WorkingStateServiceImpl(prices);
        if(vendingMachine.validateProduct(coin,item)) {
            vendingMachine=new DispenseStateServiceImpl();
            vendingMachine.dispenseItem(item);
        }

    }
}
