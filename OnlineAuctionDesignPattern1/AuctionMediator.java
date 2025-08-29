import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Auction{
    List<Player> players=new ArrayList<>();
    @Override
    public void addBidder(Player player) {
        players.add(player);
    }

    @Override
    public void placeBid(Player bidder, int bidAmount) {
        for(Player player:players) {
            if(!player.getName().equals(bidder.getName())) {
                player.recieveNotification(bidAmount);
            }
        }
    }
}
