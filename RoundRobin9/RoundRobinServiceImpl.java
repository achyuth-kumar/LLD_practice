import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobinServiceImpl implements RoundRobin{
    AtomicInteger index;
    List<String> servers;
    public RoundRobinServiceImpl(List<String> servers, AtomicInteger index) {
        this.servers = servers;
        this.index = index;
    }
    @Override
    public String getNextServer() {
        Integer currentIndex=index.incrementAndGet()%servers.size();
        return servers.get(currentIndex);
    }
}
