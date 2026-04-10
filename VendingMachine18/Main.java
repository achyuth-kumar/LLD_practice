import javax.swing.*;
import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        HashMap<Item,Integer> prices=new HashMap<>();
        prices.put(Item.COKE,Coin.FIVE.getValue());
        prices.put(Item.SPRITE,Coin.TEN.getValue());
        prices.put(Item.PEPSI,Coin.TWENTY.getValue());
        Coin coin=Coin.FIVE;
        Item item=Item.PEPSI;
        VendingMachine vendingMachine=new IdleStateServiceImpl();
        vendingMachine.insertCoin(coin);

        vendingMachine=new HasMoneyStateServiceImpl();
        vendingMachine.insertCoin(coin);
        vendingMachine.chooseProduct(item);


        vendingMachine=new WorkingStateServiceImpl(prices);
        if(vendingMachine.validateProduct(coin,item)) {
            vendingMachine=new DispenseStateServicImpl();
            vendingMachine.dispenseItem(item);
        }

    }
}
