public class SecondParty implements Party{
    public String PartyName;

    public SecondParty(String partyName) {
        this.PartyName = partyName;
    }

    public String getPartyName() {
        return PartyName;
    }


    @Override
    public void RecieveNotification() {
        System.out.println(this.PartyName+" Recieved Vote notification");
    }
}
