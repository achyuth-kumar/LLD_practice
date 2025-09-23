import java.util.HashMap;

public class WorkingState implements States{
    HashMap<Item,Integer> cost=new HashMap<>();
    WorkingState() {
        cost.put(Item.COKE,Coin.FIVE.getValue());
        cost.put(Item.PEPSI,Coin.TEN.getValue());
        cost.put(Item.SPRITE,Coin.TWENTY.getValue());
    }
    @Override
    public void InsertCoin(Integer amount,Item item) {
        ChooseProduct(amount,item);
    }

    @Override
    public void ChooseProduct(Integer amount,Item item) {
        validateProduct(amount,item);
    }

    @Override
    public void validateProduct(Integer amount,Item item) {
        if(amount<cost.get(item)) {
            System.out.println("Insufficient amount");
        }
        if(amount==cost.get(item)) {
            DispenseProduct(item);
        }
        if(amount>cost.get(item)) {
            System.out.println("please take back change : "+(amount-cost.get(item)));
            DispenseProduct(item);
        }
    }

    @Override
    public void DispenseProduct(Item item) {
        System.out.println(item+" Item Dispensed");
    }
}
