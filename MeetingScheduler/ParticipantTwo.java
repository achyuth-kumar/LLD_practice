import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ParticipantTwo  extends Calendar{
    Calendar calendar=new Calendar();
    HashMap<Date,Boolean> availability=new HashMap<>();
    ParticipantTwo() {
        int dateCount=0;
        for(int i=0;i<30;i++) {
            availability.put(new Date(2001,1,dateCount++),true);
        }
    }
    public void scheduled(Date startDate, Date endDate, List<Date> dateListTwo) {
        int start=startDate.getDate(),end= endDate.getDate();
        for(int i=start;i<=end;i++) {
            Date newDate=new Date(dateListTwo.get(i).getYear(), dateListTwo.get(i).getMonth(), dateListTwo.get(i).getDay());
            availability.put(newDate, false);
        }
        System.out.println("meeting scheduled for p2 : ["+startDate+" : "+endDate+"]");
    }
    public void canceled(Date startDate,Date endDate) {
        if(!availability.get(startDate) && !availability.get(endDate)) {
            availability.put(startDate,true);
            availability.put(endDate,true);
            System.out.println("meeting cancelled for p2 : ["+startDate+" : "+endDate+"]");
        }
        else {
            System.out.println("No meeting scheduled");
        }
    }
    public boolean getAvailability(Date date) {
        if(availability.get(date)) {
            return true;
        }
        return false;
    }
}
