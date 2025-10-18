public class FourWheeler implements VehicleType{
    public int id,InTime,OutTime;
    public String name;
    FourWheelerParkingSpace fourWheelerParkingSpace;
    public FourWheeler(int id, String name,FourWheelerParkingSpace fourWheelerParkingSpace) {
        this.id = id;
        this.name = name;
        this.fourWheelerParkingSpace=fourWheelerParkingSpace;
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
        System.out.println(this.getName()+" Four wheeler CheckIn : "+InTime);
    }

    @Override
    public void chechOut(int OutTime) {
        this.OutTime=OutTime;
        System.out.println(this.getName()+" Four wheeler CheckOut : "+OutTime);
    }

    @Override
    public void cost() {
        System.out.println("Parking cost : "+fourWheelerParkingSpace.GetCost(Vehicle.FOUR_WHEELER,InTime,OutTime));
    }
}
