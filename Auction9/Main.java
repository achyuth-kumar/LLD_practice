import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Collegoue> players= List.of(new PlayerOne("A"),new PlayerTwo("B"),new PlayerThree("C"));
        Mediator mediator=new MediatorServiceImpl(players);
        mediator.placeBid(players.get(0).getName());
        mediator.sendNotification();
    }
}
