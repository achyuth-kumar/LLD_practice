import java.util.HashMap;

public class VendingMachineServiceImpl implements VendingMachine{
    HashMap<Item,Integer> cost=new HashMap<>();
    VendingMachineServiceImpl() {
        cost.put(Item.COKE,Coin.FIVE.getValue());
        cost.put(Item.SPRITE,Coin.TEN.getValue());
        cost.put(Item.PEPSI,Coin.TWENTY.getValue());
    }
    @Override
    public void InsertCoinAndChooseProduct(Coin coin,Item item) {
        ValidateProduct(coin,item);
    }

    @Override
    public void ValidateProduct(Coin coin,Item item) {
        if(coin.getValue()<cost.get(item)) {
            System.out.println("Insufficient amount");
        }
        else if(coin.getValue()>cost.get(item)){
            System.out.println("Please lend back the change : "+(coin.getValue()-cost.get(item)));
            DispenseItem(item);
        }
        else {
            System.out.println(item+" Item validated");
            DispenseItem(item);
        }
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println(item+" Dispensed");
    }
}
