import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobin {
    List<String> servers;
    AtomicInteger Indexes;
    RoundRobin(List<String> servers) {
        this.servers=servers;
        Indexes=new AtomicInteger(-1);
    }
    public String GetNextServer() {
        int index=Indexes.incrementAndGet()%servers.size();
        return servers.get(index);
    }
}
