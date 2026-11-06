import java.util.List;

public class MediatorServiceImpl implements Mediator{
    List<Colleougue> players;
    String playerName;
    public MediatorServiceImpl(List<Colleougue> players) {
        this.players = players;
    }


    @Override
    public void placeBid(String playerName) {
        this.playerName=playerName;
        System.out.println(playerName+" : Placed Bid");
    }

    @Override
    public void sendNotification() {
        for(Colleougue player : players) {
            if(!player.getName().equals(this.playerName)) {
                player.receiveNotification();
            }
        }
    }
}
