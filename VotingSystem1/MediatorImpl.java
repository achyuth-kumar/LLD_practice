import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator{
    List<Collegeous> collegeousList=new ArrayList<>();
    MediatorImpl(List<Collegeous> collegeousList){
        this.collegeousList=collegeousList;
    }
    @Override
    public void placeBid(Collegeous collegeou) {
        collegeou.placeBid();
        this.sendNotification(collegeou);
    }

    @Override
    public void sendNotification(Collegeous collegeou) {
        for(Collegeous c : collegeousList) {
            if(!collegeou.getName().equals(c.getName())) {
                c.recieveNotification();
            }
        }
    }
}
