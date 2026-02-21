import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class ObservableServiceImpl implements Observable{
    ConcurrentSkipListMap<Double,String> cache;
    AtomicLong positionGenerator;
    List<NotificationServiceImpl> notificationServiceList;
    public ObservableServiceImpl(List<NotificationServiceImpl> notificationServiceList) {
        this.notificationServiceList = notificationServiceList;
        this.positionGenerator=new AtomicLong(0L);
        this.cache=new ConcurrentSkipListMap<>();
    }
    @Override
    public void addItem(String itemName) {
        Long newPosition=positionGenerator.incrementAndGet();
        cache.put(Double.parseDouble(newPosition.toString()),itemName);
        System.out.println("Item : "+itemName+" , got added into cart");
    }

    @Override
    public void removeItem(String itemName) {
        Double deletedPosition=0.0;
        for(Map.Entry<Double,String> entry : cache.entrySet()) {
            if(entry.getValue().equals(itemName)) {
                deletedPosition=entry.getKey();
            }
        }
        cache.remove(deletedPosition);
        System.out.println("Item : "+itemName+" , removed from cart");
    }

    @Override
    public void notifyMe() {
        for(NotificationServiceImpl notificationService : notificationServiceList) {
            notificationService.update();
        }
    }

    @Override
    public void viewItems() {
        for(Map.Entry<Double,String> entry : cache.entrySet()) {
            System.out.println(entry.getKey()+" , "+entry.getValue());
        }
    }

    @Override
    public void reorderItems(String itemName, Double beforePosition, Double nextPosition) {
        Double newPosition=(beforePosition+nextPosition)/2;
        cache.put(newPosition,itemName);

    }
}
