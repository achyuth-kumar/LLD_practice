public class FourWheelerVehicle extends Vehicle{
    FourWheelSpace fourWheelSpace;
    FourWheelerVehicle(FourWheelSpace fourWheelSpace) {
        this.fourWheelSpace=fourWheelSpace;
    }
    public void checkIn(int time) {
        fourWheelSpace.checkIn(time);
    }
    public void checkOut(int time) {
        fourWheelSpace.checkOut(time);
    }
    public int cost() {
        return fourWheelSpace.cost();
    }
}
