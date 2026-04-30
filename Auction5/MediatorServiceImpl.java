import java.util.List;

public class MediatorServiceImpl implements Mediator{
    String playerName;
    List<Colleouge> players;
    public MediatorServiceImpl(List<Colleouge> players) {
        this.players = players;
    }
    @Override
    public void placeBid(String playerName) {
        System.out.println(playerName+" , placed bid");
        this.playerName=playerName;
    }

    @Override
    public void sendNotification() {
        for(Colleouge colleouge: players) {
            if(!colleouge.getName().equals(playerName)) {
                colleouge.recieveNotification();
            }
        }
    }
}
