public class TwoWheelerVehicle extends Vehicle{
    TwoWheelSpace twoWheelSpace;
    TwoWheelerVehicle(TwoWheelSpace twoWheelSpace) {
        this.twoWheelSpace=twoWheelSpace;
    }
    public void checkIn(int time) {
        twoWheelSpace.checkIn(time);
    }
    public void checkOut(int time) {
        twoWheelSpace.checkOut(time);
    }
    public int cost() {
        return twoWheelSpace.cost();
    }
}
