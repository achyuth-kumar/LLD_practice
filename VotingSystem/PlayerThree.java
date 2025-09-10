public class PlayerThree implements Collegeus{
    MediatorImpl mediator;
    PlayerThree() {

    }
    private String name;

    PlayerThree(String name,MediatorImpl mediator) {
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
