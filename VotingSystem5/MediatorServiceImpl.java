import java.util.*;

public class MediatorServiceImpl implements Mediator{
    List<Party> partyList;
    HashMap<String,Integer> election;
    public String PartyName;
    MediatorServiceImpl(List<Party> partyList) {
        this.partyList=partyList;
        this.election=new HashMap<>();
    }
    @Override
    public void PlaceVote(String PartyName) {
        this.PartyName=PartyName;
        election.put(this.PartyName,election.getOrDefault(this.PartyName,0)+1);
    }

    @Override
    public void SendNotification() {
        for(Party party : partyList) {
            if(!party.GetName().equals(PartyName)) {
                party.RecieveNotification();
            }
        }
    }

    @Override
    public void DisplayElectionResults() {
        String Winner="";
        Integer mn=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> entry : election.entrySet()) {
            System.out.println("Party name : "+entry.getKey()+" , Votes : "+entry.getValue());
           if(entry.getValue()>mn) {
               Winner=entry.getKey();
               mn=entry.getValue();
           }
        }
        System.out.println("Winner : "+Winner);
    }
}
