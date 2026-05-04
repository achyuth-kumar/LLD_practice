import java.util.List;

public class MediatorServiceImpl implements Mediator{
    String playerName;

    List<Colleougue> players;
    public MediatorServiceImpl(List<Colleougue> players) {
        this.players = players;
    }

    @Override
    public void placeBid(String playerName) {
        this.playerName=playerName;
        System.out.println(playerName+" : placed bid");
    }

    @Override
    public void sendNotification() {
        for(Colleougue player : players) {
            if(!player.getName().equals(playerName)) {
                player.recieveNotification();
            }
        }
    }
}
