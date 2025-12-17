public class EventManager {


    public SubscriptionManager subscriptionManager;
    public EventStore eventStore;
    public AsyncDispatcher dispatcher;

    public EventManager(SubscriptionManager subscriptionManager, EventStore eventStore, AsyncDispatcher dispatcher) {
        this.subscriptionManager = subscriptionManager;
        this.eventStore = eventStore;
        this.dispatcher = dispatcher;
    }
    public void notifyEvent(OrderEvent event) {
        eventStore.save(event);
        for(Subscription sub : subscriptionManager.getSubscription(event.getEventType())) {
            dispatcher.dispatch( ()-> {
                for(ChannelType channel : sub.getPreferredChannels()) {
                   ChannelFactory.get(channel).send(
                           "Order "+ event.getOrderId()+" | Event "+event.getEventType()+" | User "+sub.getStackHolderId()
                   );
                }
                }
            );
        }
    }
    public void replayEvent(String orderId,OrderEventType eventType) {
        OrderEvent event=eventStore.get(orderId,eventType);
        if(event!=null) {
            notifyEvent(event);
        }
    }
}
