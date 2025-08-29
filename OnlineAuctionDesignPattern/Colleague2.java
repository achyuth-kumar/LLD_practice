public class Colleague2 implements Colleague{
    @Override
    public void placeBid() {
        System.out.println("Colleague2 palced bid");
    }

    @Override
    public void recieveNotification() {
        System.out.println("Colleague2 got notification");
    }
}
