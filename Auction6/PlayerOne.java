public class PlayerOne implements Colleougue{
    String name;

    public PlayerOne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void placeBid() {
        System.out.println(this.name+" , placed bid");
    }

    @Override
    public void recieveNotification() {
        System.out.println(this.name+" : recieved bid notification");
    }
}
