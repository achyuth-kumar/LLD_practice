import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        PlayerOne playerOne=new PlayerOne("Achyuth",new MediatorImpl());
        PlayerTwo playerTwo=new PlayerTwo("Kiran",new MediatorImpl());
        PlayerThree playerThree=new PlayerThree("Ravi",new MediatorImpl());
        List<Collegeus> players=new ArrayList<>();
        players.add(playerOne);
        players.add(playerTwo);
        players.add(playerThree);
        MediatorImpl mediator=new MediatorImpl(players);
        mediator.placeBid(10,playerOne.getName());
        mediator.placeBid(20,playerTwo.getName());
        mediator.placeBid(30,playerThree.getName());
        mediator.sendNotification(playerOne);
        mediator.displayBids();
    }
}
