import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> servers=List.of("server1", "server2", "server3");
//        List<Integer> weights=List.of(5,1,1);
//        WeightRoundRobin weightRoundRobin=new WeightRoundRobin(servers,weights);
//        for(int i=0;i<7;i++) {
//            System.out.println(weightRoundRobin.GetNextServer());
//        }
        RoundRobin roundRobin=new RoundRobin(servers);
        for(int i=0;i<6;i++) {
            System.out.println(roundRobin.GetNextServer());
        }

    }
}
