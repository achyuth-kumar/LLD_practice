public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth");
        Car car=new Car(1,"Alto",123);
        carService carService=new carServiceImpl();
        carService.processBooking(user.getId(),1,4,6);
        carService.processPayment(20);

        carService.processBooking(user.getId(),1,7,10);
        carService.processPayment(20);

    }

}
