import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class RoundRobinServiceImpl implements RoundRobin{
    List<String> server;
    AtomicInteger index;
    public RoundRobinServiceImpl(List<String> server, AtomicInteger index) {
        this.server = server;
        this.index= index;
    }


    @Override
    public String getNextServer() {
        Integer currentIndex=(index.incrementAndGet())%server.size();
        return server.get(currentIndex);
    }
}
