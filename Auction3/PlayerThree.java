public class PlayerThree implements Collegeoue{
    String playerName;
    public PlayerThree(String playerName) {
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
        System.out.println(this.playerName+" : recieved bid notification");
    }
}
