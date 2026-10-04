import java.util.List;
import java.util.Observer;

public class ObservableServiceImpl implements Observable{

    List<NotificationServiceImpl> observerList;
    public ObservableServiceImpl(List<NotificationServiceImpl> observerList) {
        this.observerList = observerList;
    }
    @Override
    public void addItem() {
        System.out.println("Item added into cart");
    }

    @Override
    public void removeItem() {
        System.out.println("Item removed from cart");
    }

    @Override
    public void NotifyMe() {
        for(NotificationServiceImpl o : observerList) {
            o.update();
        }
    }
}
