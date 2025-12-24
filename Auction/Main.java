import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Collegoues> players=new ArrayList<>();
        players.add(new Player(0,"Achyuth",new MediatorServiceImpl()));
        players.add(new Player(1,"Kumar",new MediatorServiceImpl()));
        players.add(new Player(2,"Ravi",new MediatorServiceImpl()));
        players.add(new Player(3,"Raj",new MediatorServiceImpl()));
        Mediator mediator=new MediatorServiceImpl(players);
        mediator.placeBid(players.get(2));
    }
}
