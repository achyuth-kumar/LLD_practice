import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        Integer [][] transactions={{0,1,5},{1,2,2},{0,2,5}};
        SplitWise splitWise=new SplitWiseServiceImpl(new HashMap<>());
        System.out.println("Result : "+splitWise.processTransaction(transactions));
    }
}
