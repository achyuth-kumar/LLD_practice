import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Integer[][] transactions={{0,1,2},{1,2,3},{0,2,4}};
        Splitwise splitwise=new SplitwiseServiceImpl(transactions,new HashMap<>());
        System.out.println(splitwise.processTransactions());
    }
}
