import javax.print.attribute.standard.Media;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Collegoue> players=List.of(new PlayerOne("One"),new PlayerTwo("Two"),new PlayerThree("Three"));
        Mediator mediator=new MediatorServiceImpl(players);
        mediator.placeBid(players.get(0).getName());
        mediator.sendNotification();
    }
}
