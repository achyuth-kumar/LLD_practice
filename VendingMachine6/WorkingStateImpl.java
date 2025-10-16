import java.util.HashMap;

public class WorkingStateImpl implements  VendingMachine{
    HashMap<Item,Integer> cost=new HashMap<>();
    WorkingStateImpl() {
        cost.put(Item.COKE,Coin.FIVE.getValue());
        cost.put(Item.PEPSI,Coin.TEN.getValue());
        cost.put(Item.SPRITE,Coin.TWENTY.getValue());
    }
    @Override
    public void InsertCoin(Coin coin) {
        System.out.println("Vending machine is in working state");
    }

    @Override
    public void ChooseProduct(Item item) {
        System.out.println(item+" has been selected");
    }

    @Override
    public boolean ValidateProduct(Coin coin,Item item) {
        int amount=coin.getValue();
        if(amount<cost.get(item)) {
            System.out.println("Insufficient amount");
            return false;
        }
        else if(amount>cost.get(item)) {
            System.out.println("Please lend back change : "+(amount-cost.get(item)));
        }
        return true;
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println("Vending machine is in working state");
    }
}
