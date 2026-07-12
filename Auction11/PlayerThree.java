public class PlayerThree implements Collegoue{


    String name;
    public PlayerThree(String name) {
        this.name = name;
    }
    @Override
    public void placeBid() {
        System.out.println(this.name+" : placed bid");
    }

    @Override
    public void recieveNotification() {
        System.out.println(this.name+" : received bid notification");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
