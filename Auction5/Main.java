import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Colleouge> players=List.of(new playerOne("A"),new playerTwo("B"),new playerThree("C"));
        Mediator auction=new MediatorServiceImpl(players);
        auction.placeBid(players.get(0).getName());
        auction.sendNotification();
    }
}
