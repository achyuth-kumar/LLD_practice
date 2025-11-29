import java.util.HashMap;

public class WorkingStateServiceImpl implements VendingMachine{
    HashMap<Item,Integer> prices=new HashMap<>();
    WorkingStateServiceImpl() {
        prices.put(Item.PEPSI,Coin.FIVE.value);
        prices.put(Item.SPRITE,Coin.TEN.value);
        prices.put(Item.COKE,Coin.TWENTY.value);
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Vending Machine is in working state");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("Vending Machine is in working state");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        if(coin.getValue()<prices.get(item)) {
            System.out.println("Insufficient amount");
            return false;
        }
        if(coin.getValue()>prices.get(item)) {
            System.out.println("Lend back change : "+(coin.getValue()-prices.get(item)));
        }
        System.out.println(item+" Item processed");
        return true;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("Vending Machine is in working state");
    }
}
