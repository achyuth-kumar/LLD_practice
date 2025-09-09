public class Driver {
    CarServiceImpl car;
    Driver(CarServiceImpl car) {
        this.car=car;
    }
    public void cost(int customerId) {
        System.out.println("Cost : "+car.Cost(customerId));
    }
    public void startCar() {
        car.Start();
    }
    public void stopCar() {
        car.Stop();
    }
    public void accelerateCar() {
        car.accelerate();
    }

}
