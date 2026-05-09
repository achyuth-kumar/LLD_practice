import javax.tools.OptionChecker;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Colleougue> players=new ArrayList<>();
        PlayerOne playerOne=new PlayerOne("A");
        PlayerTwo playerTwo=new PlayerTwo("B");
        PlayerThree playerThree=new PlayerThree("C");
        players.add(playerOne);
        players.add(playerTwo);
        players.add(playerThree);
        Mediator mediator=new MediatorServiceImpl(players);
        mediator.placeBid(playerOne.getName());
        mediator.sendNotification();
    }
}
