import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Subscription {



    public String stackHolderId;
    public OrderEventType eventType;
    public Set<ChannelType> preferredChannels= ConcurrentHashMap.newKeySet();

    public Subscription( String stackHolderId,OrderEventType eventType) {
        this.eventType = eventType;
        this.stackHolderId = stackHolderId;
    }

    public String getStackHolderId() {
        return stackHolderId;
    }

    public OrderEventType getEventType() {
        return eventType;
    }

    public Set<ChannelType> getPreferredChannels() {
        return preferredChannels;
    }
    public void addChannel(ChannelType channel) {
        preferredChannels.add(channel);
    }
    public void removeChannel(ChannelType channel) {
        preferredChannels.remove(channel);
    }
}
