import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        Party firstParty= new FirstParty("BJP");
        Party secondParty=new SecondParty("Congress");
        List<Party> partyList=new ArrayList<>();
        partyList.add(firstParty);
        partyList.add(secondParty);
        Mediator mediator=new MediatorServiceImpl(partyList);

        mediator.PlaceVote(firstParty.getName());
        mediator.SendNotification(firstParty.getName());
        mediator.PlaceVote(firstParty.getName());
        mediator.SendNotification(firstParty.getName());
        mediator.PlaceVote(firstParty.getName());
        mediator.SendNotification(firstParty.getName());
        mediator.PlaceVote(firstParty.getName());
        mediator.SendNotification(firstParty.getName());
        mediator.PlaceVote(firstParty.getName());
        mediator.SendNotification(firstParty.getName());



        mediator.PlaceVote(secondParty.getName());
        mediator.SendNotification(secondParty.getName());
        mediator.PlaceVote(secondParty.getName());
        mediator.SendNotification(secondParty.getName());
        mediator.PlaceVote(secondParty.getName());
        mediator.SendNotification(secondParty.getName());
        mediator.DisplayElectionResult();
    }
}
