import java.util.HashMap;

public class WorkingStateServiceImpl implements VendingMachine{

    HashMap<Item,Integer>prices;

    public WorkingStateServiceImpl(HashMap<Item, Integer> prices) {
        this.prices = prices;
    }
    @Override
    public void pleaseInsertCoin(Coin coin) {
        System.out.println("Vending Machine is in Working State");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("Vending Machine is in Working State");
        System.out.println(item+" : item has been selected");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        if(coin.getValue()<prices.get(item)) {
            System.out.println("Insufficient amount");
            return false;
        }
        else if(coin.getValue()>prices.get(item)) {
            System.out.println("Please lend back the change : "+(coin.getValue()-prices.get(item)));
        }
        System.out.println(item+" : item has been processed");
        return true;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("Vending Machine is in Working State");
    }
}
