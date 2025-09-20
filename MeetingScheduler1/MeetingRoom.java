import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MeetingRoom {
    public int rooms=5;
    HashMap<Integer,Integer> UserBooking=new HashMap<>();
    HashMap<Integer, List<Integer>> RoomAvailability=new HashMap<>();
    MeetingRoom() {
        for(int i=0;i<rooms;i++) {
            RoomAvailability.put(i,new ArrayList<>());
        }
    }
    public void setRoomAvailability(Integer userId,Integer roomId,List<Integer> schedule) {
        UserBooking.put(userId,roomId);
        RoomAvailability.put(roomId,schedule);
    }
    public boolean getAvailability(Integer roomId,List<Integer> NewSchedule) {
//        if(!RoomAvailability.get(roomId).isEmpty()) {
//            return false;
//        }
        // old - 1 to 5
        // new - 5 to 9
        if(!RoomAvailability.get(roomId).isEmpty()) {
            List<Integer> ExistingSchedule = RoomAvailability.get(roomId);
            if (ExistingSchedule.get(1) > NewSchedule.get(0)) {
                return false;
            }
            if (ExistingSchedule.get(1) <= NewSchedule.get(0)) {
                return true;
            }
        }
        return true;
    }
}
