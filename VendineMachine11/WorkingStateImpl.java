import java.util.HashMap;

public class WorkingStateImpl implements VendingMachine{
    HashMap<Item,Integer> prices=new HashMap<>();
    WorkingStateImpl() {
        prices.put(Item.COKE,Coin.FIVE.getValue());
        prices.put(Item.SPRITE,Coin.TEN.getValue());
        prices.put(Item.PEPSI,Coin.TWENTY.getValue());
    }
    @Override
    public void InsertCoin(Coin coin) {
        System.out.println("vending machine is in working state");
    }

    @Override
    public void ChooseProduct(Item item) {
        System.out.println("vending machine is in working state");
    }

    @Override
    public boolean ValidateProduct(Coin coin, Item item) {
        if(coin.getValue()<prices.get(item)) {
            System.out.println("Insufficient Amount");
            return false;
        }
        else if(coin.getValue()>prices.get(item)) {
            System.out.println("Take back change : "+(coin.getValue()-prices.get(item)));
        }
        System.out.println(item+" : item have been processed");
        return true;
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println("vending machine is in working state");
    }
}
