import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobin {
    List<String> servers;
    AtomicInteger indexes;
    RoundRobin(List<String> servers){
        this.servers=servers;
        indexes=new AtomicInteger(-1);
    }
    public String GetNextServer() {
        int index=indexes.incrementAndGet()%servers.size();
        return servers.get(index);
    }

}
