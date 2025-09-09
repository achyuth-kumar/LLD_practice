public class Main {
    public static void main(String [] args) {
        CarServiceImpl car=new CarServiceImpl();
        Customer customer=new Customer(1,car);
        Driver driver=new Driver(car);

        driver.startCar();
        customer.BookRide(2,5);
//        customer.BookRide(2,30);
        driver.accelerateCar();
        driver.stopCar();
        customer.exit();
        driver.cost(1);
    }
}
