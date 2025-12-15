import java.util.HashMap;

public class CustomerServiceImpl implements Customer{
    HashMap<Integer,Integer> account;
    public CustomerServiceImpl() {
        this.account = new HashMap<>();
    }
    @Override
    public void credit(Integer accountno, Integer amount) {
        account.put(accountno,account.getOrDefault(accountno,0)+amount);
    }

    @Override
    public void debit(Integer accountno, Integer amount) {
        if(amount<account.get(accountno)) {
            account.put(accountno,account.getOrDefault(accountno,0)-amount);
        }
        else {
            System.out.println("Insufficient Amount");
        }
    }

    @Override
    public void viewBalance(Integer accountno) {
        System.out.println("View balance : "+account.get(accountno));
    }
}
