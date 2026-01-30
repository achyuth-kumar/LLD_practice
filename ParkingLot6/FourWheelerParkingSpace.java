public class FourWheelerParkingSpace implements ParkingSpacetype{
    Integer inTime,outTime;
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
