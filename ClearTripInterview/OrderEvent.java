public class OrderEvent {


    public String orderId;
    public OrderEventType eventType;

    public OrderEvent(String orderId, OrderEventType eventType) {
        this.orderId = orderId;
        this.eventType = eventType;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public OrderEventType getEventType() {
        return this.eventType;
    }

}
