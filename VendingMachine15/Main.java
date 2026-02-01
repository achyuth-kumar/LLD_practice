import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        Coin coin=Coin.FIVE;
        Item item=Item.SPRITE;
        VendingMachine vendingMachine=new IdleStateServiceImpl();
        vendingMachine.insertCoin(coin);

        vendingMachine=new HasMoneyStateServiceImpl();
        vendingMachine.insertCoin(coin);

        HashMap<Item,Integer> prices=new HashMap<>();
        prices.put(Item.COKE,Coin.FIVE.getValue());
        prices.put(Item.SPRITE,Coin.TEN.getValue());
        prices.put(Item.PEPSI,Coin.TWIENTY.getValue());

        vendingMachine=new WorkingStateServiceImpl(prices);
        vendingMachine.chooseProduct(item);
        if(vendingMachine.validateProduct(coin,item)) {
            vendingMachine=new DispenseStateServiceImpl();
            vendingMachine.dispenseItem(item);
        }
    }
}
