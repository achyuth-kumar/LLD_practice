public class FirstParty implements Party{
    public String PartyName;

    public FirstParty(String partyName) {
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
