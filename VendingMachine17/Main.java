import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        HashMap<Item,Integer> prices=new HashMap<>();
        prices.put(Item.Coke,Coin.FIVE.getValue());
        prices.put(Item.Pepsi,Coin.TEN.getValue());
        prices.put(Item.Sprite,Coin.TWENTY.getValue());

        Item item=Item.Sprite;
        Coin coin=Coin.TWENTY;

        VendingMachine vendingMachine=new idleStateServiceImpl();
        vendingMachine.insertCoin(coin);

        vendingMachine=new hasMoneyStateServiceImpl();
        vendingMachine.insertCoin(coin);

        vendingMachine=new workingStateServiceImpl(prices);
        vendingMachine.chooseProduct(item);
        if(vendingMachine.validateProduct(coin,item)) {
            vendingMachine=new dispenseStateServiceImpl();
            vendingMachine.dispenseItem(item);
        }

    }
}
