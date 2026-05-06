import java.util.List;

public class Main {
    public static void main(String [] args) {
        PlayerOne playerOne=new PlayerOne("A");
        PlayerTwo playerTwo=new PlayerTwo("B");
        PlayerThree playerThree=new PlayerThree("C");
        List<Colleogue> players=List.of(playerOne,playerTwo,playerThree);
        Mediator mediator=new MediatorServiceImpl(players);
        mediator.placeBid(playerOne.getName());
        mediator.sendNotification();
    }
}
