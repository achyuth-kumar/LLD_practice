import java.util.List;

public class MediatorServiceImpl implements Mediator{
    String playerName;

    List<Collegoue> players;

    public MediatorServiceImpl(List<Collegoue> players) {
        this.players = players;
    }

    @Override
    public void placeBid(String playerName) {
        this.playerName=playerName;
        System.out.println(this.playerName+" , placed bid");
    }

    @Override
    public void sendNotification() {
        for(Collegoue player : players) {
            if(!player.getName().equals(playerName)) {
                player.recieveNotification();
            }
        }
    }
}
