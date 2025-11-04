public class PartyServiceImpl implements Party{

    public String name;

    public PartyServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public void RecieveNotification(String PartyName) {
        System.out.println(PartyName+" recieved vote notification");
    }

    @Override
    public String GetName() {
        return this.name;
    }
}
