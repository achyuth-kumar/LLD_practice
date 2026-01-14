public class Main {
    public static void main(String [] args) {
        Room room=new Room(1,"Yamuna");
        Customer customer=new Customer(1,"Achyuth");
        HotelReservation hotelReservation=new HotelReservartionServiceImpl();
        hotelReservation.processBooking(customer.getId(),room.getId(),2,5);
        hotelReservation.processPayment(50);

        hotelReservation.processBooking(customer.getId(),room.getId(),6,8);
        hotelReservation.processPayment(50);
    }
}
