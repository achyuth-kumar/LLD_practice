import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediatorImpl implements Mediator{
    HashMap<String,Integer> election=new HashMap<>();
    List<Party> partyList;
    MediatorImpl(List<Party> partyList) {
        this.partyList=partyList;
    }
    @Override
    public void CastVote(String PartyName) {
        election.put(PartyName,election.getOrDefault(PartyName,0)+1);
    }

    @Override
    public void SendNotification(String PartyName) {
        for(Party party : partyList) {
            if(!party.getPartyName().equals(PartyName)) {
                party.RecieveNotification();
            }
        }
    }



    @Override
    public void Result() {
        Integer mn=Integer.MIN_VALUE;
        String winner="";
        for(Map.Entry<String,Integer> entry : election.entrySet()) {
            if(entry.getValue()>mn) {
                winner=entry.getKey();
                mn=entry.getValue();
            }
        }
        System.out.println("Winner : "+winner);
    }


}
