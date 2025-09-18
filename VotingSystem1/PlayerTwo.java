public class PlayerTwo implements Collegeous{
    public String name;

    public String getName() {
        return name;
    }

    public PlayerTwo(String name) {
        this.name = name;
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
