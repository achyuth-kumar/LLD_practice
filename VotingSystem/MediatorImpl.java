import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediatorImpl implements  Mediator{
    List<Collegeus> players;
    HashMap<String,Integer> bid=new HashMap<>();
    MediatorImpl() {

    }
    MediatorImpl(List<Collegeus> players) {
        this.players=players;
    }
    @Override
    public void placeBid(int amount, String playerName) {
        System.out.println(playerName+" : placed bid of : "+amount);
        bid.put(playerName,amount);
    }

    @Override
    public void sendNotification(Collegeus collegue) {
        for(Collegeus player : players) {
            if(!player.getName().equals(collegue.getName())) {
                player.recieveNotification(player.getName());
            }
        }
    }
    public void displayBids() {
        System.out.println("Bids : ");
        for(Map.Entry<String,Integer> entry : this.bid.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
