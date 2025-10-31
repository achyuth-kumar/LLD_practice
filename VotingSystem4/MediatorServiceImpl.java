import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediatorServiceImpl implements Mediator{
    HashMap<String,Integer> election;
    List<Party> partyList;
    MediatorServiceImpl(List<Party> partyList) {
        this.partyList=partyList;
        election=new HashMap<>();
    }
    @Override
    public void PlaceVote(String PartyName) {
        election.put(PartyName,election.getOrDefault(PartyName,0)+1);
    }

    @Override
    public void SendNotification(String PartyName) {
        for(Party party : partyList) {
            if(!PartyName.equals(party.getName())) {
               party.ReceiveNotification();
            }
        }
    }

    @Override
    public void DisplayElectionResult() {
        String Winner="";
        Integer mn=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> entry : election.entrySet()) {
            if(entry.getValue()>mn) {
                Winner= entry.getKey();
                mn=entry.getValue();
            }
        }
        System.out.println("Winner : "+Winner);
    }

}
