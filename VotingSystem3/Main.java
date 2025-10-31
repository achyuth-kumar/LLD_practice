import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        Party firstParty=new FirstParty("BJP");
        Party secondParty=new SecondParty("Congress");

        List<Party> partyList=new ArrayList<>();
        partyList.add(firstParty);
        partyList.add(secondParty);
        Mediator mediator=new MediatorImpl(partyList);

        mediator.CastVote(firstParty.getPartyName());
        mediator.CastVote(firstParty.getPartyName());
        mediator.CastVote(firstParty.getPartyName());
        mediator.SendNotification(firstParty.getPartyName());


        mediator.CastVote(secondParty.getPartyName());
        mediator.CastVote(secondParty.getPartyName());
        mediator.CastVote(secondParty.getPartyName());
        mediator.CastVote(secondParty.getPartyName());
        mediator.CastVote(secondParty.getPartyName());
        mediator.CastVote(secondParty.getPartyName());
        mediator.SendNotification(secondParty.getPartyName());
        mediator.Result();

    }
}
