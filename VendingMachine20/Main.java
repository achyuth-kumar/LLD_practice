import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Coin coin=Coin.TWENTY;
        Item item=Item.SPRITE;
        HashMap<Item,Integer> prices=new HashMap<>();
        prices.put(Item.PEPSI,Coin.FIVE.getValue());
        prices.put(Item.SPRITE,Coin.TEN.getValue());
        prices.put(Item.COKE,Coin.TWENTY.getValue());

        VendingMachine vendingMachine=new IdleStateServiceImpl();
        vendingMachine.pleaseInsertCoin(coin);

        vendingMachine=new HasMoneyStateServiceImpl();
        vendingMachine.pleaseInsertCoin(coin);

        vendingMachine=new WorkingStateServiceImpl(prices);
        vendingMachine.chooseProduct(item);

        if(vendingMachine.validateProduct(coin,item)) {
            vendingMachine=new DispenseStateServiceImpl();
            vendingMachine.dispenseItem(item);
        }

    }
}
