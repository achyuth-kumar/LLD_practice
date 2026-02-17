public class FourWheelerSpace implements ParkingSpace{
    Integer inTime,outTime,cost;
    @Override
    public void checkIn(Integer inTime) {
        this.inTime=inTime;
    }

    @Override
    public void checkOut(Integer outTime) {
        this.outTime=outTime;
    }

    @Override
    public Integer cost() {
        return (outTime-inTime)*15;
    }
}
