import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ParticipantOne  extends Calendar{
    Calendar calendar=new Calendar();
    HashMap<Date,Boolean> availability=new HashMap<>();
    ParticipantOne() {
        int dateCount=0;
        for(int i=0;i<30;i++) {
            availability.put(new Date(2001,1,dateCount++),true);
        }
    }
    public void scheduled(Date startDate, Date endDate, List<Date> dateListOne) {
        int start=startDate.getDate(),end= endDate.getDate();
        for(int i=start;i<=end;i++) {
            Date newDate=new Date(dateListOne.get(i).getYear(), dateListOne.get(i).getMonth(), dateListOne.get(i).getDay());
            availability.put(newDate, false);
        }
        System.out.println("meeting scheduled for p1 : ["+startDate+" : "+endDate+"]");
    }
    public void canceled(Date startDate,Date endDate) {
        if(!availability.get(startDate) && !availability.get(endDate)) {
            availability.put(startDate,true);
            availability.put(endDate,true);
            System.out.println("meeting cancelled for p1 : ["+startDate+" : "+endDate+"]");
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
