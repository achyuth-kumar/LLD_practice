import java.util.HashMap;

public class WorkingStateImpl implements VendingMachine{
    HashMap<Item,Integer> price=new HashMap<>();
    WorkingStateImpl() {
        price.put(Item.COKE,Coin.FIVE.getValue());
        price.put(Item.PEPSI,Coin.TEN.getValue());
        price.put(Item.SPRITE,Coin.TWENTY.getValue());
    }
    @Override
    public void InsertCoin(Coin coin) {
        System.out.println("vending machine is in working state");
    }

    @Override
    public void ChooseProduct(Item item) {
        System.out.println(item+" product have been selected");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        if(coin.getValue()<price.get(item)) {
            System.out.println("Insufficient amount");
            return false;
        }
        else if(coin.getValue()>price.get(item)) {
            System.out.println("please lend back change : "+(coin.getValue()-price.get(item)));
        }
        System.out.println(item+" : processed");
        return true;
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println("vending machine is in working state");
    }
}
