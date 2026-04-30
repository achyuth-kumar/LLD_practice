public class playerOne implements Colleouge{

    String name;

    public playerOne(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void placeBid() {
        System.out.println(name+" , placed bid ");
    }

    @Override
    public void recieveNotification() {
        System.out.println(this.name+" , recieved bid notification");

    }
}
