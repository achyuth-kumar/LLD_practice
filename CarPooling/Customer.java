public class Customer {
    CarServiceImpl car;
    public int id;
    Customer(int id,CarServiceImpl car) {
        this.id=id;
        this.car=car;
    }
    public void BookRide(int start,int end) {
        car.Book(this.id,start,end);
    }
    public void exit() {
        car.Exit(this.id);
    }
}
