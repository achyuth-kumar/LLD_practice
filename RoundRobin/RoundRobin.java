import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobin {
    List<String> servers;
    AtomicInteger indexs;
    RoundRobin(List<String> servers) {
        this.servers=servers;
        indexs=new AtomicInteger(-1);
    }
    public String GetNextserver() {
        int index=indexs.incrementAndGet()%servers.size();
        return servers.get(index);
    }
}
