public class PlayerTwo implements Collegeoue{
    String playerName;
    public PlayerTwo(String playerName) {
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
