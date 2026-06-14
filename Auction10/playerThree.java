public class playerThree implements Collegoue{


    String name;

    public playerThree(String name) {
        this.name = name;
    }


    @Override
    public void placeBid() {
        System.out.println(this.name+"  placed bid");
    }

    @Override
    public void recieveNotification() {
        System.out.println(this.name+" received bid notification");
    }
    @Override
    public String getName() {
        return this.name;
    }
}
