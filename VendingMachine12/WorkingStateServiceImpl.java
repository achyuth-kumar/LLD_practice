import java.util.HashMap;

public class WorkingStateServiceImpl implements VendingMachine{

    HashMap<Item,Integer> prices=new HashMap<>();
    public WorkingStateServiceImpl(HashMap<Item, Integer> prices) {
        this.prices = prices;
    }

    @Override
    public void InsertCoin(Coin coin) {
        System.out.println("Vending Machine is in Working state");
    }

    @Override
    public void ChooseProduct(Item item) {
        System.out.println("Vending Machine is in Working state");
    }

    @Override
    public boolean ValidateProduct(Coin coin, Item item) {
        if(prices.get(item)>coin.getValue()) {
            System.out.println("Insufficient amount!");
            return false;
        }
        if(coin.getValue()>prices.get(item)) {
            System.out.println("please lend back the change : "+(coin.getValue()-prices.get(item)));
        }
        System.out.println(item+", has been processed");
        return true;
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println("Vending Machine is in Working state");
    }
}
