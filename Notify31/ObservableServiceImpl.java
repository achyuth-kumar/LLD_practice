import java.util.List;

public class ObservableServiceImpl implements Observable{
    List<Observer> observerList;

    public ObservableServiceImpl(List<Observer> observerList) {
        this.observerList = observerList;
    }


    @Override
    public void addItem(String item) {
        System.out.println(item+" , item added into cart");
    }

    @Override
    public void removeItem(String item) {
        System.out.println(item+" , item removed from cart");
    }

    @Override
    public void notifyMe() {
        for(Observer o : observerList) {
            o.update();
        }
    }
}
