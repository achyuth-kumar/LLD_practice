import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        VendingMachine vendingMachine=new IdleStateServiceImpl();
        Coin coin=Coin.FIVE;
        Item item=Item.SPRITE;
        HashMap<Item,Integer> prices=new HashMap<>();
        prices.put(Item.COKE,Coin.FIVE.value);
        prices.put(Item.SPRITE,Coin.TEN.value);
        prices.put(Item.PEPSI,Coin.TWENTY.value);
        vendingMachine.InsertCoin(coin);

        vendingMachine=new HasMoneyStateServiceImpl();
        vendingMachine.InsertCoin(coin);

        vendingMachine=new WorkingStateServiceImpl(prices);
        vendingMachine.ChooseProduct(item);
        if(vendingMachine.ValidateProduct(coin,item)) {
            vendingMachine=new DispenseStateServiceImpl();
            vendingMachine.DispenseItem(item);
        }
    }
}

