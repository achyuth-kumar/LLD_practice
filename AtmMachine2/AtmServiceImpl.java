import java.util.HashMap;
import java.util.Map;

public class AtmServiceImpl {
    HashMap<Integer,Integer> account;
    hundredHandler hundred;
    thousandHandler thousand;
    fiveHundredHandler fiveHundred;
    public AtmServiceImpl(hundredHandler hundred,fiveHundredHandler fiveHundred,thousandHandler thousand) {
        this.account=new HashMap<>();
        this.hundred=hundred;
        this.fiveHundred=fiveHundred;
        this.thousand=thousand;
    }

    public void credit(int userId,int amount) {
        if(amount%100==0) {
            hundred.processTransaction();
        }
        else if(amount%500==0) {
            fiveHundred.processTransaction();
        }
        else if(amount%1000==0) {
            thousand.processTransaction();
        }
        account.put(userId,account.getOrDefault(userId,0)+amount);
    }
    public void debit(int userId,int amount) {
        if(amount%100==0) {
            hundred.processTransaction();
        }
        else if(amount%500==0) {
            fiveHundred.processTransaction();
        }
        else if(amount%1000==0) {
            thousand.processTransaction();
        }
        account.put(userId,account.getOrDefault(userId,0)-amount);
    }
    public void viewBalance(int userid) {

        for(Map.Entry<Integer,Integer> entry : account.entrySet()) {
            System.out.println("userId : "+entry.getKey()+" , : balance : "+entry.getValue());
        }
    }
//    public void debit();
//    public void viewBalance();

}

