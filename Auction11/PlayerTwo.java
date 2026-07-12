public class PlayerTwo implements Collegoue{
    String name;

    public PlayerTwo(String name) {
        this.name = name;
    }


    @Override
    public void placeBid() {
        System.out.println(this.name+" : placed bid");
    }

    @Override
    public void recieveNotification() {
        System.out.println(this.name+" : received bid notificaiton");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
