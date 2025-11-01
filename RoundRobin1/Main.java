import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> servers= List.of(new String[]{"server1", "server2", "server3"});
        RoundRobin roundRobin=new RoundRobin(servers);
        for(int i=0;i<6;i++) {
            System.out.println(roundRobin.GetNextServer());
        }
    }
}
