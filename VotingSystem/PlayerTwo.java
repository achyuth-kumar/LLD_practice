public class PlayerTwo implements Collegeus{
    MediatorImpl mediator;
    PlayerTwo() {

    }
    private String name;

    PlayerTwo(String name,MediatorImpl mediator) {
        this.name=name;
        this.mediator=mediator;
    }
    public String getName() {
        return name;
    }

    @Override
    public void placeBid(int amount) {
        mediator.placeBid(amount,this.getName());
    }

    @Override
    public void recieveNotification(String playerName) {
        System.out.println(playerName+" : recieved bid notification ");
    }
}
