public class PlayerOne implements Colleougue{

    String name;
    public PlayerOne(String name) {
        this.name = name;
    }

    @Override
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
