import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediatorImpl implements  Mediator{
    HashMap<String,Integer> result=new HashMap<>();
    List<Party> parties=new ArrayList<>();
    MediatorImpl(List<Party> parties) {
        this.parties=parties;
    }
    MediatorImpl() {

    }
    @Override
    public void PlaceVote(Party party) {
        result.put(party.getName(),result.getOrDefault(party.getName(),0)+1);
        System.out.println(party.getName()+" :  Placed vote");
    }

    @Override
    public void SendNotification(Party party) {
        for(Party party1 : parties) {
            if(!party.getName().equals(party1.getName())) {
                party1.RecieveNotification();
            }
        }
    }

    @Override
    public void DisplayResults() {
        System.out.println("Voting results : ");
        int mn=Integer.MIN_VALUE;
        String winner="";
        for(Map.Entry<String,Integer> entry : result.entrySet()) {
            if(entry.getValue()>mn) {
                mn=entry.getValue();
                winner=entry.getKey();
            }
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println(winner+" : have won the election");
    }
}
