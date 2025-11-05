import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        Party firstParty=new PartyServiceImpl("BJP");
        Party secondParty=new PartyServiceImpl("CONGRESS");
        List<Party> partyList=new ArrayList<>();
        partyList.add(firstParty);
        partyList.add(secondParty);
        Mediator mediator=new MediatorServiceImpl(partyList);
        mediator.PlaceVote(firstParty.GetName());
        mediator.SendNotification(firstParty.GetName());
        mediator.PlaceVote(firstParty.GetName());
        mediator.SendNotification(firstParty.GetName());

        mediator.PlaceVote(secondParty.GetName());
        mediator.SendNotification(secondParty.GetName());
        mediator.PlaceVote(secondParty.GetName());
        mediator.SendNotification(secondParty.GetName());
        mediator.PlaceVote(secondParty.GetName());
        mediator.SendNotification(secondParty.GetName());
        mediator.DisplayElectionResults();
    }
}
