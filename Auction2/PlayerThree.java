public class PlayerThree implements Colleougue{

    public Integer id;
    public String name;

    public PlayerThree(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void placeBid() {
        System.out.println(this.name+" Placed Bid");
    }

    @Override
    public void recieveNotification() {
        System.out.println(this.name+" : recieved bid notification");
    }
}
