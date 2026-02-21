import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ObservableServiceImpl implements Observable{


    List<NotificationServiceImpl> notificationServiceList;
    ConcurrentHashMap<Integer,List<Integer>> cart=new ConcurrentHashMap<>();
    public ObservableServiceImpl(List<NotificationServiceImpl> notificationServiceList) {
        this.notificationServiceList = notificationServiceList;
    }
    @Override
    public void addItem(Integer userId,Integer itemId) {
        if(!cart.containsKey(userId)) {
            cart.put(userId,new ArrayList<>());
        }
        cart.get(userId).add(itemId);
        System.out.println("Item got added into cart");
    }

    @Override
    public void removeItem(Integer userId,Integer itemId) {
        cart.get(userId).remove(itemId);
        System.out.println("Item got removed from cart");
    }

    @Override
    public void notifyMe() {
        for(NotificationServiceImpl notificationService : notificationServiceList) {
            notificationService.update();
        }
    }
}
