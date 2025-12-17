import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SubscriptionManager {
    public  final ConcurrentHashMap<OrderEventType, Set<Subscription>> store=new ConcurrentHashMap<>();
    public SubscriptionManager() {
        for(OrderEventType event:OrderEventType.values()) {
            store.put(event,ConcurrentHashMap.newKeySet());
        }
    }
    public void subscribe(String userId,OrderEventType event) {
        store.get(event).add(new Subscription(userId,event));
    }
    public void unsubscribe(String userId,OrderEventType event) {
        store.get(event).removeIf(s->
            s.getStackHolderId().equals(userId));
    }
    public void addChannel(String userId,OrderEventType event, ChannelType channel) {
        store.get(event).forEach( s-> {
            if(s.getStackHolderId().equals(userId))
                s.addChannel(channel);
        });
    }
    public void removeChannel(String userId,OrderEventType event,ChannelType channel) {
        store.get(event).forEach( s-> {
            if(s.getStackHolderId().equals(userId))
                s.removeChannel(channel);
        });
    }
    public Set<Subscription> getSubscription(OrderEventType event) {
        return store.get(event);
    }



}
