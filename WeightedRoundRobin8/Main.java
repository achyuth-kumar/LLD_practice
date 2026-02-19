import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> servers= List.of("S1","S2","S3");
        List<Integer> weights=List.of(5,1,1);
        WeightedRoundRobin loadBalancer=new WeightedRoundRobinServiceImpl(servers,weights);
        for(int i=0;i<10;i++) {
            System.out.println(loadBalancer.getNextServer());
        }
    }
}
