import java.util.HashMap;

public class ATMServiceImpl implements ATMService{

    HashMap<Integer,Integer> account;
    public ATMServiceImpl() {
        this.account = new HashMap<>();
    }


    @Override
    public void credit(int acountNo,int amount,Operations operations) {
        if(amount%100==0) {
            account.put(acountNo,account.getOrDefault(acountNo,0)+amount);
        } else if(amount%500==0) {
            account.put(acountNo,account.getOrDefault(acountNo,0)+amount);
        }else if(amount%1000==0) {
            account.put(acountNo,account.getOrDefault(acountNo,0)+amount);
        }
        operations.processTransactions();
    }

    @Override
    public void debit(int acountNo,int amount) {
        if(account.get(acountNo)<amount) {
            System.out.println("Insufficient balance for : "+acountNo);
            return ;
        }
        if(account.get(acountNo)>=amount) {
            account.put(acountNo,account.getOrDefault(acountNo,0)-amount);
            System.out.println(amount+" has been debitted from : "+acountNo);
        }
    }

    @Override
    public void viewBalance(int acountNo) {
        System.out.println("balacne of account : "+acountNo+" : is : "+account.get(acountNo));
    }
}
