import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String [] args) {
        List<String> servers=List.of("S1","S2","S3");
        RoundRobin loadBalancer=new RoundRobinServiceImpl(servers,new AtomicInteger(-1));
        for(int i=0;i<6;i++) {
            System.out.println(loadBalancer.getNextServer());
        }
    }
}
