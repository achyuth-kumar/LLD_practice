public class OrderService {

    public EventManager eventManager;
    public OrderService(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void placeOrder(String orderId) {
        eventManager.notifyEvent(new OrderEvent(orderId,OrderEventType.ORDER_PLACED));
    }
    public void shipOrder(String orderId) {
        eventManager.notifyEvent(new OrderEvent(orderId,OrderEventType.ORDER_SHIPPED));
    }
    public void deliverOrder(String orderId) {
        eventManager.notifyEvent(new OrderEvent(orderId,OrderEventType.ORDER_DELIVERIED));
    }
}
