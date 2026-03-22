import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        Integer [][] transactions={{0,1,5},{1,2,7},{0,2,4}};
        Splitwise splitwise=new SplitwiseServiceImpl(new HashMap<>(),transactions,new ArrayList<>());
        System.out.println("Result : "+splitwise.processTransaction());
    }
}
