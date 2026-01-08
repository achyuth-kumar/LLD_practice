public class TwoWheelerParkingSpace implements ParkingSpace{
    Integer InTime,OutTime;
    @Override
    public void CheckIn(Integer InTime) {
        this.InTime=InTime;
    }

    @Override
    public void CheckOut(Integer OutTime) {
        this.OutTime=OutTime;
    }

    @Override
    public Integer cost() {
        return (this.OutTime-this.InTime)*10;
    }
}
