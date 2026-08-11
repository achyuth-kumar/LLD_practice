import java.util.List;

public class ObservableServiceImpl implements Observable{

    List<Observer> observerList;
    public ObservableServiceImpl(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void addItem(String item) {
        System.out.println(item+" : item got added into cart");
    }

    @Override
    public void removeItem(String item) {
        System.out.println(item+" : item got removed from cart");
    }

    @Override
    public void NotifyMe() {
        for(Observer o : observerList) {
            o.update();
        }
    }
}
