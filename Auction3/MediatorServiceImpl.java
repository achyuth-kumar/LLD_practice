import java.util.List;

public class MediatorServiceImpl implements Mediator{

    String playerName;

    List<Collegeoue> players;
    public MediatorServiceImpl(List<Collegeoue> players) {
        this.players = players;
    }
    @Override
    public void placeBid(String playerName) {
        this.playerName=playerName;
        System.out.println(playerName+" : placed bid");
    }

    @Override
    public void sendNotification() {
        for(Collegeoue player : players) {
            if(!player.getName().equals(playerName)) {
                player.recieveNotification();
            }
        }
    }
}
