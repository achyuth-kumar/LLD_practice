import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> Servers=List.of("S1","S2","S3");
        List<Integer> Weights= List.of(5,1,1);
        RoundRobin loadBalancer=new RoundRobinServiceImpl(Weights,Servers);
        for(int i=0;i<7;i++) {
            System.out.println(loadBalancer.GetNextServer());
        }
    }
}
