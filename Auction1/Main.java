import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Colleague> players=new ArrayList<>();
        PlayerOne playerOne=new PlayerOne(new MediatorServiceImpl(),"Achyuth");
        PlayerTwo playerTwo=new PlayerTwo(new MediatorServiceImpl(),"Kumar");
        PlayerThree playerThree=new PlayerThree(new MediatorServiceImpl(),"Ravi");
        players.add(playerOne);
        players.add(playerTwo);
        players.add(playerThree);
        Mediator mediator=new MediatorServiceImpl(players);
        mediator.placeBid(playerOne.getName());
        mediator.sendNotification(playerOne.getName());

        playerTwo.placeBid();
        mediator.sendNotification(playerTwo.getName());
    }
}
