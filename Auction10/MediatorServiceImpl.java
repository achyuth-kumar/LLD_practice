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
        System.out.println(playerName+" , placed bid");
    }

    @Override
    public void sendNotification() {
        for(Collegoue player : players) {
            if(!playerName.equals(player.getName())) {
                player.recieveNotification();
            }
        }
    }
}
