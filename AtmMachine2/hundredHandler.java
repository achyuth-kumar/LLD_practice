import java.util.HashMap;
import java.util.Map;

public class hundredHandler implements Operations{
    HashMap<Integer,Integer> account;
    public hundredHandler() {
        this.account=new HashMap<>();
    }
    @Override
    public void processTransaction() {
        System.out.println("Hundred handler invoked");
    }


}
