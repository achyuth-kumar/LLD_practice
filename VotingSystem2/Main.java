import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        FirstParty firstParty=new FirstParty(1,"BJP",new MediatorImpl());
        SecondParty secondParty=new SecondParty(2,"Congress",new MediatorImpl());
        List<Party> partyList=new ArrayList<>();
        partyList.add(firstParty);
        partyList.add(secondParty);
        Mediator mediator=new MediatorImpl(partyList);
        mediator.PlaceVote(firstParty);
        mediator.PlaceVote(firstParty);
        mediator.SendNotification(firstParty);


        mediator.PlaceVote(secondParty);
        mediator.PlaceVote(secondParty);
        mediator.PlaceVote(secondParty);
        mediator.SendNotification(secondParty);

        mediator.DisplayResults();

    }
}
