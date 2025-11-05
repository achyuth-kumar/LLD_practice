public class PartyServiceImpl implements Party{
    public String PartyName;
    public PartyServiceImpl(String partyName) {
        this.PartyName = partyName;
    }

    @Override
    public void RecieveNotification(String RecieptentPartyName) {
        System.out.println(RecieptentPartyName+" : recieved vote notification");
    }

    @Override
    public String GetName() {
        return this.PartyName;
    }
}
