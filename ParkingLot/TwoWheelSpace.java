public class TwoWheelSpace implements ParkingSpace{
    public int inTime,outTime,type;
    TwoWheelSpace(int type) {
        this.type=type;
    }
    @Override
    public int cost() {
        return (outTime-inTime)*10;
    }

    @Override
    public void checkIn(int t) {
        this.inTime = t;
    }

    @Override
    public void checkOut(int t) {
        this.outTime=t;
    }
}
