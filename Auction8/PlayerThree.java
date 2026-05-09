public class PlayerThree implements Colleougue{

    String playerName;
    public PlayerThree(String playerName) {
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
