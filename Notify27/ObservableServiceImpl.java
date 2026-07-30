import java.util.List;

public class ObservableServiceImpl implements Observable{
    List<Observer> observers;

    public ObservableServiceImpl(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void addItem(String item) {
        System.out.println(item+ " , got added into cart");
    }

    @Override
    public void removeItem(String item) {
        System.out.println(item+ " , removed from cart");
    }

    @Override
    public void NotifyMe() {
        for(Observer o : observers) {
            o.update();
        }
    }
}
