import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObservableImpl implements Observable{
    HashMap<NotificationServiceImpl, Boolean> users;
    //Watches<NotificationServiceImpl,Boolean>
    //Shoes<NotificationServiceImpl,Boolean>
    //
    ObservableImpl(HashMap<NotificationServiceImpl, Boolean> users) {
        this.users=users;
    }

    @Override
    public void AddItem() {
        System.out.println("Article added");
    }

    @Override
    public void RemoveItem() {
        System.out.println("Article removed");
    }

    @Override
    public void NotifyMe() {
        int index=0;
        for(Map.Entry<NotificationServiceImpl,Boolean> entry : users.entrySet()) {
            if(entry.getValue()) {
                entry.getKey().update("user "+index);
            }
            index+=1;
        }
    }
}
