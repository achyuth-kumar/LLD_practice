public class TwoWheeler implements VehicleType{
    public int id,InTime,OutTime;
    public String name;
    TwoWheelerParkingSpace twoWheelerParkingSpace;
    public TwoWheeler(int id, String name,TwoWheelerParkingSpace twoWheelerParkingSpace) {
        this.id = id;
        this.name = name;
        this.twoWheelerParkingSpace=twoWheelerParkingSpace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void checkIn(int InTime) {
        this.InTime=InTime;
        System.out.println(this.getName()+" Two wheeler CheckIn : "+InTime);
    }

    @Override
    public void chechOut(int OutTime) {
        this.OutTime=OutTime;
        System.out.println(this.getName()+" Two wheeler CheckOut : "+OutTime);
    }

    @Override
    public void cost() {
        System.out.println("Parking cost : "+twoWheelerParkingSpace.GetCost(Vehicle.TWO_WHEELER,InTime,OutTime));
    }
}
