import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> servers= List.of("S1","S2","S3");
        List<Integer> weights=List.of(5,1,1);
        roundRobin loadbalancer=new roundRobinServiceImpl(servers,weights);
        for(int i=0;i<7;i++) {
            System.out.println(loadbalancer.getNextServer());
        }
    }

}
