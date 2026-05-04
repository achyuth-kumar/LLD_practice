import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        PlayerOne playerOne=new PlayerOne("Achyuth");
        PlayerTwo playerTwo=new PlayerTwo("Kumar");
        PlayerThree playerThree=new PlayerThree("Ravi");
        List<Colleougue> players=List.of(playerOne,playerTwo,playerThree);
        Mediator mediator=new MediatorServiceImpl(players);
        mediator.placeBid(playerOne.getName());
        mediator.sendNotification();
    }
}

