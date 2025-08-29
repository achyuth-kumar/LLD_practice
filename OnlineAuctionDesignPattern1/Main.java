public class Main {
    public static void main(String [] args) {
        AuctionMediator mediator=new AuctionMediator();
        Player player1=new Bidder(mediator,"Achyuth");
        mediator.addBidder(player1);
        Player player2=new Bidder(mediator,"Kumar");
        mediator.addBidder(player2);
        mediator.placeBid(player2,100);
    }
}
