import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        Colleougue playerOne=new PlayerOne(1,"Achyuth");
        Colleougue playerTwo=new PlayerOne(2,"Kumar");
        Colleougue playerThree=new PlayerOne(3,"Ravi");
        List<Colleougue> players=new ArrayList<>();
        players.add(playerOne);
        players.add(playerTwo);
        players.add(playerThree);
        Mediator mediator=new MediatorServiceImpl(players);
        mediator.placeBid(playerOne.getName());
        mediator.sendNotification();
    }
}
