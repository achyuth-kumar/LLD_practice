import java.util.HashMap;

public class VendingMachine {
    HashMap<Item,Integer> cost=new HashMap<>();
    VendingMachine() {
        cost.put(Item.PEPSI,Coin.FIVE.getValue());
        cost.put(Item.SPRITE,Coin.TEN.getValue());
        cost.put(Item.COKE,Coin.TWENTY.getValue());
    }
    public void InsertCoinAndChooseProduct(Coin coin,Item item) {
        int amount=coin.getValue();
        ValidateProduct(amount,item);
    }
    public void ValidateProduct(int amount,Item item) {
        if(amount<cost.get(item)) {
            System.out.println("Insufficient amount, please take back change "+amount);
            return ;
        }
        else if(amount>cost.get(item)) {
            System.out.println("Please take back change "+(amount-cost.get(item)));
        }
        DispenseItem(item);
    }
    public void DispenseItem(Item item) {
        System.out.println(item+" Item dispensed");
    }

}
