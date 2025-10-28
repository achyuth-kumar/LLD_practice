import java.util.HashMap;

public class WorkingStateImpl implements VendingMachine{
    HashMap<Item,Integer> prices=new HashMap<>();
    WorkingStateImpl() {
        prices.put(Item.COKE,Coin.FIVE.getValue());
        prices.put(Item.PEPSI,Coin.TEN.getValue());
        prices.put(Item.SPRITE,Coin.TWENTY.getValue());
    }
    @Override
    public void InsertCoin(Coin coin) {
        System.out.println("Vending Machine is in WOrking state");
    }

    @Override
    public void ChooseProduct(Item item) {
        System.out.println("Vending Machine is in WOrking state");

    }

    @Override
    public boolean ValidateProduct(Coin coin,Item item) {
        if(coin.getValue()<prices.get(item)) {
            System.out.println("Insufficient amount");
            return false;
        }
        else if(coin.getValue()>prices.get(item)) {
            System.out.println("Please lend back the change : "+(coin.getValue()-prices.get(item)));
        }
        return true;
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println("Vending Machine is in WOrking state");
    }
}
