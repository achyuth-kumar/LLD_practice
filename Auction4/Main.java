import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Collegoue> players=new ArrayList<>();
        players.add(new playerOne("first player"));
        players.add(new playerTwo("second player"));
        players.add(new playerThree("third player"));
        Mediator mediator=new MediatorServiceImpl(players);
        mediator.placeBid(players.get(0).getPlayerName());
        mediator.sendNotification();
    }
}
