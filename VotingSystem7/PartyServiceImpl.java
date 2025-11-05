public class PartyServiceImpl implements Party{

    public String PartyName;

    public PartyServiceImpl(String partyName) {
        this.PartyName = partyName;
    }

    @Override
    public void RecieveNotification(String PartyName) {
        System.out.println(PartyName+" party have recieved vote notification");
    }

    @Override
    public String GetName() {
        return this.PartyName;
    }
}
