import java.util.concurrent.ConcurrentHashMap;

public class EventStore {
    public ConcurrentHashMap<String,OrderEvent> store=new ConcurrentHashMap<>();
    public void save(OrderEvent event) {
        store.put(event.getOrderId()+"_"+event.getEventType(),event);
    }
    public OrderEvent get(String orderId,OrderEventType eventType) {
        return store.get(orderId+"_"+eventType);
    }
}
