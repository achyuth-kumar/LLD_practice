import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Coin coin=Coin.TEN;
        Item item=Item.Coke;
        HashMap<Item,Integer> prices=new HashMap<>();
        prices.put(Item.Coke,Coin.FIVE.getValue());
        prices.put(Item.Sprite,Coin.TEN.getValue());
        prices.put(Item.Pepsi,Coin.TWENTY.getValue());
        VendingMachine vendingMachine=new IdleStateServiceImpl();
        vendingMachine.pleaseInsertCoin(coin,item);

        vendingMachine=new HasMoneyStateServiceImpl();
        vendingMachine.pleaseInsertCoin(coin,item);

        vendingMachine=new WorkingStateServiceImpl(prices);
        vendingMachine.chooseProduct(coin,item);

        if(vendingMachine.validateProduct(coin,item)) {
            vendingMachine=new DispenseStateServiceImpl();
            vendingMachine.dispenseItem(item);
        }


    }
}
