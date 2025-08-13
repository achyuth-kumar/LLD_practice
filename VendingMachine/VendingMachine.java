import java.util.HashMap;
import java.util.Map;

public class VendingMachine implements State{

    public int coin,valid=-1;
    HashMap<String,Integer> mpp=new HashMap<>();
    VendingMachine() {
        mpp.put(Item.PEPSI.getValue(), Coin.five.getValue());
        mpp.put(Item.COKE.getValue(), Coin.ten.getValue());
        mpp.put(Item.SPRITE.getValue(), Coin.fifteen.getValue());
    }

    @Override
    public void showMenu() {
        for(Map.Entry<String,Integer> entry : mpp.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    @Override
    public void insertCoin(int coin) {
        if(coin==Coin.five.getValue() ||coin==Coin.ten.getValue() || coin==Coin.fifteen.getValue()) {
            this.coin=coin;
            this.valid=1;
            System.out.println(coin+" coin has inserted , select item");
        }
        else {
            this.valid=0;
        }
    }

    @Override
    public void dispenseItem(String item) {
        if(this.valid==1) {
            if (this.coin < mpp.get(item)) {
                System.out.println("Insufficient amount for item : " + item);
            } else if (this.coin == mpp.get(item)) {
                this.coin = 0;
                System.out.println(item + " dispensed");
            } else if (this.coin > mpp.get(item)) {
                System.out.println("Enter valid coin for item : " + item);
            }
        }
        else if(this.valid==0) {
            System.out.println("Please insert a valid coin");
        }
    }

}
