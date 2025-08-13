import java.util.HashMap;
import java.util.Map;

public class VendingMachine implements  State{
    public int coin,valid=-1;
    HashMap<String,Integer> mpp=new HashMap<>();
    VendingMachine() {
        mpp.put(Item.PEPSI.getValue(), Coin.FIVE.getValue());
        mpp.put(Item.COKE.getValue(), Coin.TEN.getValue());
        mpp.put(Item.SPRITE.getValue(), Coin.TWENTY.getValue());
    }
    @Override
    public void idleState() {
        System.out.println("Menu : ");
        for(Map.Entry<String,Integer> entry : mpp.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    @Override
    public void enterCoin(int coin) {
        if(coin==Coin.FIVE.getValue() || coin==Coin.TEN.getValue() || coin==Coin.TWENTY.getValue()) {
            this.coin=coin;
            this.valid=1;
        }
        else {
            this.valid=0;
        }
    }

    @Override
    public void dispenseItem(String item) {
        if(this.valid==1) {
            if(this.coin==mpp.get(item)) {
                System.out.println(item + " dispensed");
            }
            else if(this.coin<mpp.get(item)) {
                System.out.println("Insuffiecient amount");
            }
            else if(this.coin>mpp.get(item)) {
                System.out.println(item+" dispensed");
                System.out.println("Take back the change "+ (this.coin-mpp.get(item)));
            }
        }
        else if(this.valid==0) {
            System.out.println("Insert valid coin");
        }
    }
}
