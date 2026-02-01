import java.util.HashMap;

public class WorkingStateServiceImpl implements  VendingMachine{

    HashMap<Item,Integer> prices;
    public WorkingStateServiceImpl(HashMap<Item, Integer> prices) {
        this.prices = prices;
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Vending machine is in working state");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println(item+" : item selected");
    }

    @Override
    public boolean validateProduct(Coin coin,Item item) {
        if(coin.getValue()<prices.get(item)) {
            System.out.println("Insufficient amount");
            return false;
        }
        else if(coin.getValue()>prices.get(item)) {
            System.out.println("Lend back the change : "+(coin.getValue()-prices.get(item)));
        }
        System.out.println(item+" : item processed");
        return true;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("Vending machine is in working state");

    }
}
