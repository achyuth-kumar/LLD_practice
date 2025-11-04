import java.util.HashMap;

public class WorkingStateImpl implements VendingMachine{
    HashMap<Item,Integer> prices=new HashMap<>();
    WorkingStateImpl() {
        prices.put(Item.PEPSI,Coin.FIVE.getValue());
        prices.put(Item.SPRITE,Coin.TEN.getValue());
        prices.put(Item.COKE,Coin.TWENTY.getValue());
    }
    @Override
    public void InsertCoin(Coin coin) {
        System.out.println("Vending machine is in Working state");
    }

    @Override
    public void ChooseProduct(Item item) {
        System.out.println("Vending machine is in Working state");
    }

    @Override
    public boolean ValidateProduct(Coin coin, Item item) {
        if(coin.value<prices.get(item)) {
            System.out.println("Insufficient amount");
            return false;
        }
        if(coin.value>prices.get(item)) {
            System.out.println("please take back change : "+(coin.value-prices.get(item)));
        }
        System.out.println(item+" : item processed");
        return true;
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println("Vending machine is in Working state");
    }
}
