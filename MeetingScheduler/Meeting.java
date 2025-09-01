import java.util.Date;
import java.util.List;

public class Meeting extends  Calendar{
    Host host;
    ParticipantOne participantOne;
    ParticipantTwo participantTwo;
    List<Date> dateListOne,dateListTwo;
    Meeting(Host h,ParticipantOne Pone, ParticipantTwo Ptwo,List<Date> dateListOne,List<Date> dateListTwo) {
        this.host=h;
        this.participantOne=Pone;
        this.participantTwo=Ptwo;
        this.dateListOne=dateListOne;
        this.dateListTwo=dateListTwo;
    }
    public boolean checkAvailability(Date startDate,Date endDate,List<Date> dateListOne,List<Date> dateListTwo) {
        int start= startDate.getDate(),end=endDate.getDate();
        for(int i=start;i<=end;i++) {
            Date newDate=new Date(dateListOne.get(i).getYear(), dateListOne.get(i).getMonth(), dateListOne.get(i).getDay());
            if (!participantOne.getAvailability(newDate)) {
                System.out.println("Participant one is not available");
                return false;
            }
        }
        for(int i=start;i<=end;i++) {
            Date newDate=new Date(dateListTwo.get(i).getYear(), dateListTwo.get(i).getMonth(), dateListTwo.get(i).getDay());
            if (!participantTwo.getAvailability(newDate)) {
                System.out.println("Participant two is not available");
                return false;
            }
        }
        System.out.println("We are good to schedule this meeting");
        return true;
    }
    public void schedule(Date startDate, Date endDate) {
        participantOne.scheduled(startDate,endDate,dateListOne);
        participantTwo.scheduled(startDate, endDate,dateListTwo);
    }
    public void cancel(Date startDate,Date endDate) {
        participantOne.canceled(startDate,endDate);
    }
}
