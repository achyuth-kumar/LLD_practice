import java.util.List;

public class MediatorServiceImpl implements Mediator{
    String playerName;
    List<Colleogue> players;
    public MediatorServiceImpl(List<Colleogue> players) {
        this.players = players;
    }

    @Override
    public void placeBid(String playerName) {
        this.playerName=playerName;
        System.out.println(playerName+" : placed bid");
    }

    @Override
    public void sendNotification() {
        for(Colleogue player : players) {
            if(!player.getName().equals(playerName)) {
                player.receiveNotification();
            }
        }
    }
}
