import Pair.Pair;

import java.util.HashMap;

public class RoomSeviceImpl implements Ivisit{
    HashMap<Integer,Integer> customerBooking=new HashMap<>();
    HashMap<Integer, Pair<Integer,Integer>> roomBooking=new HashMap<>();

    @Override
    public void visit(RoomElement roomElement) {
        if(roomElement instanceof SingleRoom) {
            System.out.println("Single Room visited");
        }
        else {
            System.out.println("Duplex Room visited");
        }
    }

    @Override
    public boolean checkAvailability(int customerId,Integer start,Integer end,int roomId) {
        if(roomBooking.containsKey(roomId)) {
            Pair<Integer,Integer> existingBooking=roomBooking.get(roomId);
            if(existingBooking!=null) {
                if ((start>=existingBooking.first && start < existingBooking.second) || (end>=existingBooking.first && end < existingBooking.second)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void processBooking(int customerId,Integer start,Integer end,int amount,RoomElement roomElement) {
        if(checkAvailability(customerId,start,end,roomElement.getRoomId()) && payment(customerId,start,end,amount,roomElement)) {
            customerBooking.put(customerId, roomElement.getRoomId());
            Pair<Integer,Integer> newInterval=new Pair<Integer, Integer>();
            newInterval.first=start;
            newInterval.second=end;
            roomBooking.put(roomElement.getRoomId(), newInterval);
            System.out.println("CustomerID: "+customerId+" : have successfully booked : "+roomElement.getRoomId());
        }
        else {
            System.out.println("CustomerID: "+customerId+" : booking failed : "+roomElement.getRoomId());
        }
    }

    @Override
    public boolean payment(int customerId, Integer start, Integer end, int amount,RoomElement roomElement) {
        // per day - 1000 for single room
        // per day - 2000 for duplex room
        int days=(end-start);
        if(roomElement instanceof SingleRoom) {
            int price=days*1000;
           if(amount<price) {
               System.out.println("Insufficient amount");
               return false;
           }
           else if(amount>price) {
               System.out.println("Please take back the change : "+(amount-price));
           }
           System.out.println("RoomID: "+roomElement.getRoomId()+" : payment processed successfully");
        }
        else if(roomElement instanceof DuplexRoom) {
            int price=days*2000;
            if(amount<price) {
                System.out.println("Insufficient amount");
                return false;
            }
            else if(amount>price) {
                System.out.println("Please take back the change : "+(amount-price));
            }
            System.out.println("RoomID: "+roomElement.getRoomId()+" : payment processed successfully");
        }
        return true;
    }
}
