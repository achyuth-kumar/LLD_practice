import java.util.List;

public class MediatorServiceImpl implements Mediator{

    List<Collegoue> players;
    String playerName;
    public MediatorServiceImpl(List<Collegoue> players) {
        this.players = players;
    }

    @Override
    public void placeBid(String playerName) {
        this.playerName=playerName;
        System.out.println(playerName+" , placed bid");
    }

    @Override
    public void sendNotification() {
        for(Collegoue player : players) {
            if(!player.getName().equals(playerName)) {
                player.receiveNotification();
            }
        }
    }
}
