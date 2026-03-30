import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Collegeoue> players=new ArrayList<>();
        players.add(new PlayerOne("Achyuth"));
        players.add(new PlayerTwo("Kumar"));
        players.add(new PlayerThree("Ravi"));
        Mediator mediator=new MediatorServiceImpl(players);
        mediator.placeBid(players.get(1).getName());
        mediator.sendNotification();
    }
}
