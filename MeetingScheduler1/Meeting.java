import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Meeting {
    HashMap<Integer, List<Integer>> host=new HashMap<>();
    List<Integer> participants=new ArrayList<>();
    MeetingRoom room;
    Meeting(MeetingRoom room) {
        this.room=room;
    }
    public void BookMeeting(Integer hostId,Integer roomID,List<Integer> schedule,List<Integer> participants) {
        System.out.println("User : "+hostId+" bookings");
        if(room.getAvailability(roomID,schedule)) {
            host.put(hostId,schedule);
            this.participants=participants;
            room.setRoomAvailability(hostId,roomID,schedule);
        }
        else {
            this.participants=new ArrayList<>();
            System.out.println("RoomID : "+roomID+" is not available");
        }
    }
    public void DisplayParticipants() {
        if(!this.participants.isEmpty()) {
            System.out.println("Participants : ");
            for(Integer i : this.participants) {
                System.out.println("ParticipantID : "+i);
            }
        }
    }
}
