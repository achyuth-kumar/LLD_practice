public class TwoWheelerParkingSpace implements ParkingSpace{
    Integer inTime,outTime;
    @Override
    public void CheckIn(Integer inTime) {
        this.inTime=inTime;
    }

    @Override
    public void CheckOut(Integer outTime) {
        this.outTime=outTime;
    }

    @Override
    public Integer Cost() {
        return (this.outTime-this.inTime)*10;
    }
}
