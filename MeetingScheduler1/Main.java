import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        User user1=new User(1,"Achyuth");
        User user2=new User(2,"Kumar");
        User user3=new User(3,"Ravi");
        MeetingRoom room=new MeetingRoom();
        Meeting meeting=new Meeting(room);
        List<Integer> schedule=new ArrayList<>();
        schedule.add(1);
        schedule.add(5);
        List<Integer> participants=new ArrayList<>();
        participants.add(0);
        participants.add(1);
        participants.add(2);
        participants.add(3);
        meeting.BookMeeting(1,0, schedule, participants);
        meeting.DisplayParticipants();


        schedule=new ArrayList<>();
        schedule.add(5);
        schedule.add(9);
        participants=new ArrayList<>();
        participants.add(0);
        participants.add(1);
        participants.add(2);
        participants.add(3);
        meeting.BookMeeting(2,0, schedule, participants);
        meeting.DisplayParticipants();

    }

}
