import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Integer [][] transactions={{0,1,1},{1,2,5},{0,2,3}};
        SplitWise splitWise=new SplitWiseServiceImpl(transactions,new HashMap<>());
        System.out.println(splitWise.processTransaction());
    }
}
