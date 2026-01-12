public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer(1,"Achyuth");
        Room room=new Room(1,"Yamuna");
        HotelReservation hotelReservation=new HotelReservationServiceImpl();
        hotelReservation.processBooking(room.getRoomNo(),customer.getId(),1,2);
        hotelReservation.processPayment(5);
        hotelReservation.processBooking(room.getRoomNo(),customer.getId(),1,5);
        hotelReservation.processPayment(30);

    }
}
