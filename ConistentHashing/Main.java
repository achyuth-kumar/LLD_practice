import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> servers= List.of("S1","S2","S3","S4","S5");
        ConsistentHashing hashing=new ConsistentHashing(3,servers);

        System.out.println(hashing.GetServer("UserA"));

        hashing.AddServer("S6");
        System.out.println(hashing.GetServer("UserA"));
        System.out.println(hashing.GetServer("UserB"));

    }
}
