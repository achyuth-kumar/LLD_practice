public class playerThree implements Collegoue{

    String playerName;
    public playerThree(String playerName) {
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
