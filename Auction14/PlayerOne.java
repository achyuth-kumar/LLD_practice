public class PlayerOne implements Collegoue{
    String name;

    public PlayerOne(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void placeBid() {
        System.out.println(this.name+" : placed bid");
    }

    @Override
    public void receiveNotification() {
        System.out.println(this.name+" : received bid notification");
    }
}
