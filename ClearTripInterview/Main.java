import com.sun.jdi.event.ExceptionEvent;

public class Main {
    public static void main(String [] args) {
        SubscriptionManager subscriptionManager=new SubscriptionManager();
        EventStore eventStore=new EventStore();
        AsyncDispatcher dispatcher=new AsyncDispatcher();
        EventManager eventManager=new EventManager(subscriptionManager,eventStore,dispatcher);
        OrderService orderService=new OrderService(eventManager);

         //Place order
        subscriptionManager.subscribe("CUSTOMER_1",OrderEventType.ORDER_PLACED);
        subscriptionManager.removeChannel("CUSTOMER_1",OrderEventType.ORDER_PLACED,ChannelType.PUSH);
        orderService.placeOrder("ORDER-1");
        subscriptionManager.addChannel("CUSTOMER_1",OrderEventType.ORDER_PLACED,ChannelType.SMS);
        eventManager.replayEvent("ORDER-1",OrderEventType.ORDER_PLACED);

        //Ship order
        subscriptionManager.subscribe("CUSTOMER_1",OrderEventType.ORDER_SHIPPED);
        subscriptionManager.removeChannel("CUSTOMER_1",OrderEventType.ORDER_SHIPPED,ChannelType.PUSH);
        orderService.shipOrder("ORDER-1");
        subscriptionManager.addChannel("CUSTOMER_1",OrderEventType.ORDER_SHIPPED,ChannelType.SMS);
        eventManager.replayEvent("ORDER-1",OrderEventType.ORDER_SHIPPED);

        //Deliver order
        subscriptionManager.subscribe("CUSTOMER_1",OrderEventType.ORDER_DELIVERIED);
        subscriptionManager.removeChannel("CUSTOMER_1",OrderEventType.ORDER_DELIVERIED,ChannelType.PUSH);
        orderService.deliverOrder("ORDER-0");
        subscriptionManager.addChannel("CUSTOMER_1",OrderEventType.ORDER_DELIVERIED,ChannelType.SMS);
        eventManager.replayEvent("ORDER-0",OrderEventType.ORDER_DELIVERIED);

    }
}
