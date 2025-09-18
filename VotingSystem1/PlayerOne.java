public class PlayerOne implements Collegeous{

    public String name;
    public PlayerOne(String name) {
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
