import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> servers= List.of(new String[]{"server1", "server2", "server3"});
        List<Integer> weights= List.of(new Integer[]{5,1,1});
        WeightedRoundRobin weightedRoundRobin=new WeightedRoundRobin(servers,weights);
        for(int i=0;i<7;i++) {
            System.out.println(weightedRoundRobin.GetNextServer());
        }
    }
}
