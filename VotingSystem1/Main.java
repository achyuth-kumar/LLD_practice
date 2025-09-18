import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Collegeous> collegeousList=new ArrayList<>();
        collegeousList.add(new PlayerOne("Achyuth"));
        collegeousList.add(new PlayerTwo("Kumar"));
        collegeousList.add(new PlayerThree("Ravi"));
        Mediator mediator=new MediatorImpl(collegeousList);
        mediator.placeBid(collegeousList.get(1));
    }
}
