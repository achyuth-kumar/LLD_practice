public class PlayerOne implements Colleague{

    public String name;
    Mediator mediator;
    public PlayerOne(Mediator mediator,String name) {
        this.name = name;
        this.mediator=mediator;
    }

    public String getName() {
        return this.name;
    }


    @Override
    public void placeBid() {
        mediator.placeBid(this.name);
    }

    @Override
    public void recieveNotification() {
        System.out.println(this.name+" , recieved notification");
    }
}
