import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObservableImpl implements Observable{
    HashMap<Integer,String> cart=new HashMap<>();
    @Override
    public void addItem(Integer id,String productName) {
        cart.put(id,productName);
        System.out.println("Item : "+productName+" Got added");
    }

    @Override
    public void removeItem(Integer id) {
        System.out.println("Item : "+cart.get(id)+" got removed");
        cart.remove(id);
    }

    @Override
    public void notification(List<NotificationServiceImpl> notificationServiceList) {
        for(NotificationServiceImpl notificationService:notificationServiceList) {
            if(notificationService instanceof EmailNotificationServiceImpl)
                notificationService.update("email");
            else if(notificationService instanceof MessageNotificationServiceImpl)
                notificationService.update("message");
        }
    }

    @Override
    public void displayCartItems() {
        System.out.println("All items");
        for(Map.Entry<Integer,String> entry : cart.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
