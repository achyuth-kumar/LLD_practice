public class TwoWheeler implements Vehicle{


    ParkingSpaceType parkingSpaceType;

    public TwoWheeler(ParkingSpaceType parkingSpaceType) {
        this.parkingSpaceType = parkingSpaceType;
    }

    @Override
    public void CheckIn(Integer in) {
        parkingSpaceType.CheckIn(in);
    }

    @Override
    public void CheckOUt(Integer out) {
        parkingSpaceType.CheckOut(out);
    }


}
