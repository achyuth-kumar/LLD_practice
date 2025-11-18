import java.util.HashMap;
import java.util.Map;

public class fiveHundredHandler implements Operations{
    HashMap<Integer,Integer> account;
    public fiveHundredHandler() {
        this.account=new HashMap<>();
    }
    @Override
    public void processTransaction() {
        System.out.println("Hundred handler invoked");
    }

}
