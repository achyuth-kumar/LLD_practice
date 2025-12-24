import java.util.List;

public class MediatorServiceImpl implements Mediator{

    List<Collegoues> players;
    public MediatorServiceImpl(List<Collegoues> players) {
        this.players = players;
    }
    public MediatorServiceImpl() {

    }
    @Override
    public void placeBid(Collegoues player) {
        System.out.println(player.getName()+" , Placed bid");
        sendNotification(player);
    }

    @Override
    public void sendNotification(Collegoues player) {
        for(Collegoues p : players) {
            if(!player.getName().equals(p.getName())) {
                p.recieveNotification();
            }
        }
    }
}
