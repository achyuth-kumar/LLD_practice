public class playerTwo implements Collegoue{

    String playerName;
    public playerTwo(String playerName) {
        this.playerName = playerName;
    }
    public String getPlayerName() {
        return playerName;
    }
    @Override
    public void placeBid() {
        System.out.println(playerName+" , have placed bid");
    }

    @Override
    public void recieveNotification() {
        System.out.println(playerName+" , recieved bid notification");
    }
}
