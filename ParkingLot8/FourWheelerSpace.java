public class FourWheelerSpace implements ParkingSpace{
    Integer intime,outTime;
    @Override
    public void checkIn(Integer inTime) {
        this.intime=inTime;
    }

    @Override
    public void checkOut(Integer outTime) {
        this.outTime=outTime;
    }

    @Override
    public Integer cost() {
        return (outTime-intime)*15;
    }
}
