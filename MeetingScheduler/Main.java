import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        Calendar calendarOne=new Calendar();
        List<Date> dateListOne=calendarOne.createCalendar();
        Calendar calendarTwo=new Calendar();
        List<Date> dateListTwo=calendarTwo.createCalendar();
        Calendar hostCalendar=new Calendar();
        List<Date> dateListHost=hostCalendar.createCalendar();

        Host host=new Host();
        ParticipantOne participantOne=new ParticipantOne();
        ParticipantTwo participantTwo=new ParticipantTwo();
        Meeting meeting=new Meeting(host,participantOne,participantTwo,dateListOne,dateListTwo);
        Date startDate=new Date(2001,0,1);
        Date endDate=new Date(2001,0,2);
        if(meeting.checkAvailability(startDate,endDate,dateListOne,dateListTwo)) {
            meeting.schedule(startDate,endDate);
        }
        if(meeting.checkAvailability(startDate,endDate,dateListOne,dateListTwo)) {
            meeting.cancel(startDate,endDate);
        }

        int start=startDate.getDate(),end=endDate.getDate();
        System.out.println("P1 : ");
        for(int i=start;i<=end;i++) {
            if(participantOne.getAvailability(dateListOne.get(i))) {
                System.out.println(dateListOne.get(i));
            }
        }
        System.out.println("P2 : ");
        for(int i=start;i<=end;i++) {
            if(participantTwo.getAvailability(dateListTwo.get(i))) {
                System.out.println(dateListTwo.get(i));
            }
        }

    }
}
