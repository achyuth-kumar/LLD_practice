import java.util.HashMap;
import java.util.Map;

public class thousandHandler implements Operations{
    HashMap<Integer,Integer> account;
    public thousandHandler() {
        this.account=new HashMap<>();
    }
    @Override
    public void processTransaction() {
        System.out.println("Hundred handler invoked");
    }


}
