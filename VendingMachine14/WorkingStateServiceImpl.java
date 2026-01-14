import java.util.HashMap;

public class WorkingStateServiceImpl implements VendingMachine{

    HashMap<Item,Integer> prices;
    public WorkingStateServiceImpl(HashMap<Item, Integer> prices) {
        this.prices = prices;
    }
    @Override
    public void insertCoin(Coin coin) {
        System.out.println("vending machine is in Working state");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("vending machine is in Working state");
    }

    @Override
    public boolean validateProduct(Coin coin,Item item) {
        if(coin.getValue()<prices.get(item)) {
            System.out.println("Insufficient amount");
            return false;
        }
        else if(coin.getValue()>prices.get(item)) {
            System.out.println("please lend back change : "+(coin.getValue()-prices.get(item)));
        }
        System.out.println(item+" : Item processed successfully");
        return true;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("vending machine is in Working state");
    }
}
