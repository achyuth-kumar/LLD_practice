import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Party> partyList=new ArrayList<>();
        Party firstParty=new PartyServiceImpl(1,"BJP");
        Party secondParty=new PartyServiceImpl(2,"CONGRESS");
        partyList.add(firstParty);
        partyList.add(secondParty);
        Mediator mediator=new MediatorServiceImpl(partyList);
        mediator.PlaceVote(firstParty.GetName());
        mediator.SendNotification();
        mediator.PlaceVote(firstParty.GetName());
        mediator.SendNotification();
        mediator.PlaceVote(firstParty.GetName());
        mediator.SendNotification();


        mediator.PlaceVote(secondParty.GetName());
        mediator.SendNotification();
        mediator.PlaceVote(secondParty.GetName());
        mediator.SendNotification();
        mediator.DisplayElectionResults();
    }

}
