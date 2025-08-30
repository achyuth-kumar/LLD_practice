import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println(random.nextInt(5));
        /*IVisit visitor=new VisitImpl();
        HotelRoom singleRoom=new SingleRoom();
        if(singleRoom.available()) {
            visitor.visit("Single room");
        }

        HotelRoom doubleRoom=new DoubleRoom();
        if(doubleRoom.available()) {
            visitor.visit("Double room");
        }

        HotelRoom deluxeRoom=new DeluxeRoom();
        if(deluxeRoom.available()) {
            visitor.visit("Deluxe room");
        }
        else {
            System.out.println("Deluxe room not available");
        }*/
    }
}
