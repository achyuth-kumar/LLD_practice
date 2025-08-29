public class Bidder implements  Player{
    String name;
    AuctionMediator mediator;
    Bidder(AuctionMediator mediator,String name) {
        this.mediator=mediator;
        this.name=name;
    }
    @Override
    public void placeBid(Player player, int bidAmount) {
        mediator.addBidder(player);
    }

    @Override
    public void recieveNotification(int bidAmount) {
        System.out.println(this.name+" reived bid notification of "+ bidAmount);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
