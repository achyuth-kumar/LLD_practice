public class Main {
    public static void main(String[] args) {
        User user=new User(1,"Achyuth");
        Movie movie=new Movie(1,"ABC");
        NetflixBooking booking=new NetflixBookingServiceImpl();
        booking.processBooking(user.getId(),1,0,30);
        booking.processPayment(300);


        booking.processBooking(user.getId(),1,31,60);
        booking.processPayment(400);
    }
}
