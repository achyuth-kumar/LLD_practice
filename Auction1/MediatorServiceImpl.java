import java.util.List;

public class MediatorServiceImpl implements Mediator{
    List<Colleague> players;
    public MediatorServiceImpl() {
    }
    public MediatorServiceImpl(List<Colleague> players) {
        this.players = players;
    }
    @Override
    public void placeBid(String playerName) {
        System.out.println(playerName+" , placed bid");
    }

    @Override
    public void sendNotification(String playerName) {
        for(Colleague player : players) {
            if(!player.getName().equals(playerName)) {
                player.recieveNotification();
            }
        }
    }
}
