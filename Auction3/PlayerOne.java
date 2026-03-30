import java.util.stream.StreamSupport;

public class PlayerOne implements Collegeoue{


    String playerName;
    public PlayerOne(String playerName) {
        this.playerName = playerName;
    }
    @Override
    public String getName() {
        return this.playerName;
    }

    @Override
    public void placeBid() {
        System.out.println(this.playerName+" : placed bid");
    }

    @Override
    public void recieveNotification() {
        System.out.println(this.playerName+" : Recieved bid notification");
    }
}
