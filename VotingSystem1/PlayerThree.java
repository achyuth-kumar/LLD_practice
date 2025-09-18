public class PlayerThree implements Collegeous{
    public String name;

    public PlayerThree(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void placeBid() {
        System.out.println(this.getName()+" placed bid");
    }

    @Override
    public void recieveNotification() {
        System.out.println(this.getName()+" recieved notification");
    }
}
