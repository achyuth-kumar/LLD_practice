import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        Integer [][] transactions={{0,1,1},{1,2,3},{0,2,2}};
        SplitWise splitWise=new SplitWiseServiceImpl(new HashMap<>(),transactions);
        System.out.println(splitWise.processTransactions());
    }
}
