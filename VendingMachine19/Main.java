import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Item,Integer> prices=new HashMap<>();
        prices.put(Item.COKE,Coin.FIVE.getValue());
        prices.put(Item.PEPSI,Coin.TEN.getValue());
        prices.put(Item.SPRITE,Coin.TWENTY.getValue());
        Item item=Item.PEPSI;
        Coin coin=Coin.FIVE;
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
