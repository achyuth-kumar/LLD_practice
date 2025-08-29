public class Colleague1 implements Colleague{
    @Override
    public void placeBid() {
        System.out.println("Colleague1 palced Bid");
    }

    @Override
    public void recieveNotification() {
        System.out.println("Colleague1 got notification");
    }
}
