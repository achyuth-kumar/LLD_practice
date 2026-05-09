public class PlayerOne implements Colleougue{

    String playerName;
    public PlayerOne(String playerName) {
        this.playerName = playerName;
    }
    @Override
    public void placeBid() {
        System.out.println(this.playerName+" , placed bid");
    }

    @Override
    public void receiveNotification() {
        System.out.println(this.playerName+" , received bid notification");
    }

    @Override
    public String getName() {
        return this.playerName;
    }
}
