public class Player implements Collegoues{

    public Integer id;
    public String name;
    public Mediator mediator;
    public Player(Integer id, String name,Mediator mediator) {
        this.id = id;
        this.name = name;
        this.mediator=mediator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void placeBid() {
        mediator.placeBid(this);
    }

    @Override
    public void recieveNotification() {
        System.out.println(this.getName()+" , Recieved bid notification");
    }
}
