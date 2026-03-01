import java.util.HashMap;

public class workingState implements VendingMachine{


    HashMap<Item,Integer> prices;
    public workingState(HashMap<Item, Integer> prices) {
        this.prices = prices;
    }
    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Vending machine is in Working state");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("Vending machine is in Working state");
    }

    @Override
    public boolean validateProdcut(Coin coin, Item item) {
        if(prices.get(item)>coin.getValue()) {
            System.out.println("Insufficient amount");
            return false;
        }
        if(prices.get(item)<coin.getValue()) {
            System.out.println("Lend back change : "+(coin.getValue()-prices.get(item)));
        }
        System.out.println(item+" : item processed");
        return true;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("Vending machine is in Dispense state");
    }
}
