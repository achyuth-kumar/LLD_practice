import javax.print.attribute.IntegerSyntax;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String [] args) {
        List<String> servers=List.of("Server1","Server2","server3");
//        RoundRobin roundRobin=new RoundRobin(servers);
//        for(int i=0;i<6;i++) {
//            System.out.println(roundRobin.GetNextServer());
//        }
        List<Integer> Weights=List.of(5,1,1);
        WeightedRoundRobin weightedRoundRobin=new WeightedRoundRobin(servers,Weights);
        for(int i=0;i<7;i++) {
            System.out.println(weightedRoundRobin.GetNextServer());
        }
    }
}

