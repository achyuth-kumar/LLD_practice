import java.util.*;
public class Observable implements Observer {
    HashMap<String,Integer> mpp=new HashMap<>();
    Integer max_size=10;
    @Override
    public void add(String input) {
        mpp.put(input,mpp.getOrDefault(input,0)+1);
        System.out.println("Item added into cart");
    }
    @Override
    public void remove(String input) {
        if(mpp.containsKey(input)) {
            mpp.remove(input);
            System.out.println("Item removed from cart");
        }
        else {
            System.out.println("Invalid input");
        }
    }
    @Override
    public void notification() {
        if(mpp.size()>max_size) {
            System.out.println("Email Notification have been sent to you");
        }
        else {
            System.out.println("Try booking for some other location");
        }
    }
}