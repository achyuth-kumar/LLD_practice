import java.util.List;
import java.util.ServiceLoader;

public class Main {
    public static void main(String [] args) {
        List<String> Servers=List.of("S1","s2","S3");
        List<Integer> Weights=List.of(5,1,1);
        RoundRobin loadbalancer=new RoundRobinServiceImpl(Servers,Weights);
        for(int i=0;i<7;i++) {
            System.out.println(loadbalancer.getNextServer());
        }
    }
}
