import java.util.HashMap;

public class VendingMachineImpl implements VendingMachine{
    HashMap<Item,Integer> prices=new HashMap<>();
    VendingMachineImpl() {
        prices.put(Item.PEPSI, Coin.FIVE.getValue());
        prices.put(Item.COKE, Coin.TEN.getValue());
        prices.put(Item.SPRITE, Coin.TWENTY.getValue());
            
    }
    @Override
    public void insertAndSelectProduct(Coin coin, Item item) {
        if(validateProduct(coin, item)) {
            dispenseItem(item);
        }
        else {
            System.out.println("Please insert sufficient coin for "+item);
        }
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        if(coin.getValue()>prices.get(item)) {
            System.out.println("Lend back change : "+(coin.getValue()-prices.get(item)));
            return true;
        }
        else if(coin.getValue()==prices.get(item)) {
            System.out.println(item+" can be dispsensed");
            return true;
        }
        return false;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println(item+" item dispensed");
    }
    
}
