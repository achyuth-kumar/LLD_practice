import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        Coin coin=Coin.TWENTY;
        Item item=Item.COKE;
        VendingMachine vendingMachine=new idleState();
        vendingMachine.insertCoin(coin);

        vendingMachine=new hasMoneyState();
        vendingMachine.insertCoin(coin);

        HashMap<Item,Integer> prices=new HashMap<>();
        prices.put(Item.COKE,Coin.FIVE.getValue());
        prices.put(Item.PEPSI,Coin.TEN.getValue());
        prices.put(Item.SPRITE,Coin.TWENTY.getValue());
        vendingMachine=new workingState(prices);
        vendingMachine.chooseProduct(item);
        if(vendingMachine.validateProdcut(coin,item)) {
            vendingMachine=new dispenseState();
            vendingMachine.dispenseItem(item);
        }


    }
}
