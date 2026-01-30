import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

public class ATMMachineServiceImpl implements ATMMachine{

    HashMap<Integer,Integer> account;
    OperationFactory operationFactory;
    public ATMMachineServiceImpl(OperationFactory operationFactory) {
        this.operationFactory=operationFactory;
        this.account=new HashMap<>();
    }

    @Override
    public void credit(Integer accountId, Integer amount) {
        OperationStrategy operationStrategy=operationFactory.createOperationHandler(amount);
        operationStrategy.processTransaction();
        System.out.println(amount+" : Credited");
        account.put(accountId,account.getOrDefault(accountId,0)+amount);
    }

    @Override
    public void debit(Integer accountId, Integer amount) {
        OperationStrategy operationStrategy=operationFactory.createOperationHandler(amount);
        operationStrategy.processTransaction();
        if(account.get(accountId)<amount) {
            System.out.println("Insufficient balance");
        }
        else if(account.get(accountId)>=amount){
            int debitedAmount=account.get(accountId)-amount;
            account.put(accountId,debitedAmount);
            System.out.println("Debitted amount : "+amount);
        }
    }

    @Override
    public void viewBalance() {
        System.out.println("Bank DB : ");
        for(Map.Entry<Integer,Integer> entry : account.entrySet()) {
            System.out.println("Account : "+entry.getKey()+" , Balance : "+entry.getValue());
        }
    }
}
