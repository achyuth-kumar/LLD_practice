import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> servers= List.of("Server1","Server2","Server3");
//        RoundRobin roundRobin=new RoundRobin(servers);
//        for(int i=0;i<6;i++) {
//            System.out.println(roundRobin.GetNextServer());
//        }
        List<Integer> weights=List.of(5,1,1);
        WeightedRoundRobin weightedRoundRobin=new WeightedRoundRobin(servers,weights);
        for(int i=0;i<7;i++) {
            System.out.println(weightedRoundRobin.GetNextServer());
        }
    }
}
