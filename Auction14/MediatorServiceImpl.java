import java.util.List;

public class MediatorServiceImpl implements Mediator{
    List<Collegoue> players;

    public MediatorServiceImpl(List<Collegoue> players) {
        this.players = players;
    }

    @Override
    public void placeBid(String name) {
        System.out.println(name+" : placed bid");
    }

    @Override
    public void sendNotification(String name) {
        for(Collegoue player : players) {
            if(!player.getName().equals(name)) {
                player.receiveNotification();
            }
        }
    }
}
