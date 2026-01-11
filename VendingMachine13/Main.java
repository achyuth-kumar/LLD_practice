import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        VendingMachine vendingMachine=new IdleState();
        Item item=Item.SPRITE;
        Coin coin=Coin.FIVE;
        vendingMachine.insertCoin(coin);

        vendingMachine=new HasMoneyState();
        vendingMachine.insertCoin(coin);

        HashMap<Item,Integer> prices=new HashMap<>();
        prices.put(Item.COKE,Coin.FIVE.getValue());
        prices.put(Item.SPRITE,Coin.TEN.getValue());
        prices.put(Item.PEPSI,Coin.TWENTY.getValue());

        vendingMachine=new WorkingState(prices);
        if(vendingMachine.validateProduct(coin,item)) {
            vendingMachine=new DispenseState();
            vendingMachine.dispenseItem(item);
        }

    }
}
