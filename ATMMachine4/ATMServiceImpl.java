import java.util.HashMap;

public class ATMServiceImpl implements ATMService{
    HashMap<Integer,Integer> account;
    Operations operations;
    public ATMServiceImpl(Operations operations) {
        this.operations=operations;
        account=new HashMap<>();
    }

    public void invokeHandler(Integer amount) {
        operations.processTransactions();
    }

    public void credit(Integer accountno,Integer amount) {
        account.put(accountno,account.getOrDefault(accountno,0)+amount);
    }
    public void debit(Integer accountno,Integer amount){
        if(account.get(accountno)>=amount) {
            account.put(accountno, account.getOrDefault(accountno, 0) - amount);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    public void viewBalance(Integer accountno){
        if(account.containsKey(accountno)) {
            System.out.println("Balance : " + account.get(accountno));
        }
        else {
            System.out.println(accountno+" : Account not found");
        }
    }
}
