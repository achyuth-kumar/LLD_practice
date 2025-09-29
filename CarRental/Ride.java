import javax.swing.*;
import java.util.HashMap;
import java.util.List;

public class Ride {
    public int id,startRide,endRide,distance=0,currentPosition=0,seatNo;
    HashMap<Integer, Integer> CustomerBooking=new HashMap<Integer, Integer>();
    HashMap<Integer, List<Integer>> RideBooking=new HashMap<>();
    Ride(int startRide,int endRide) {
        for(int i=0;i<4;i++) {
            RideBooking.put(i,null);
        }
        this.startRide=startRide;
        this.endRide=endRide;
    }

    public boolean CheckAvailability(int seatNo) {
        if(this.RideBooking.get(seatNo)==null) {
            return true;
        }
        return false;
    }
    public void ProcessBooking(Integer CustomerId,Integer SeatNo,List<Integer> rideBook) {
        int bookStart=rideBook.get(0),bookEnd=rideBook.get(1);
        if((bookStart<this.currentPosition || bookEnd<this.currentPosition) || (bookStart<startRide || bookStart>endRide) || (bookEnd<startRide || bookEnd>endRide)) {
            System.out.println("Kindly book within car's vicinity");
            return;
        }
        if(CheckAvailability(SeatNo)) {
            this.CustomerBooking.put(CustomerId,SeatNo);
            this.RideBooking.put(SeatNo,rideBook);
            System.out.println(SeatNo+" : booked successfully : "+rideBook.get(0)+" : "+rideBook.get(1));
            this.distance= rideBook.get(1)-rideBook.get(0);
            this.seatNo=seatNo;
        }
        else {
            System.out.println("Seat no : "+SeatNo+" Not available");
        }
        this.currentPosition+=this.distance;
    }
    public void GetPaymentStatus(int amount) {
        if(this.distance==0) {
            System.out.println("Ride didnt get successfull");
            return ;
        }
        if(amount>=this.distance*5) {
            this.RideBooking.put(this.seatNo,null);
            System.out.println("Payment successfully");
        }
        else {
            System.out.println("Payment failed");
        }
    }

}
