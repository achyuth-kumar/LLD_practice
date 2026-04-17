public class playerOne implements Collegoue{



    String playerName;
    public playerOne(String playerName) {
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
