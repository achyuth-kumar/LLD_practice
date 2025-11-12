import java.util.HashMap;

public class WorkingStateServiceImpl implements CoffeeMachine{
    HashMap<Item,Integer> prices=new HashMap<>();
    WorkingStateServiceImpl() {
        prices.put(Item.FLITER_COFFEE,Coin.FIVE.getValue());
        prices.put(Item.STRONG_COFFEE,Coin.TEN.getValue());
        prices.put(Item.TEA,Coin.TWENTY.getValue());
        prices.put(Item.BADAM,Coin.TEN.getValue());
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Coffee machine is in Working state");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println(item + " : item have been selected");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        if(coin.getValue()<prices.get(item)) {
            System.out.println("Insufficient amount");
            return false;
        }
        if(coin.getValue()>prices.get(item)) {
            System.out.println("Take back the change : "+(coin.getValue()-prices.get(item)));
        }
        System.out.println(item+" : item processed");
        return true;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("Coffee machine is in Working state");
    }
}
