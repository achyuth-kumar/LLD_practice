public class Vehicle {
    public Vehicle getType(int type) {
        if(type==2)
            return new TwoWheelerVehicle(new TwoWheelSpace(type));
        if(type==4)
            return new FourWheelerVehicle(new FourWheelSpace(type));
        return null;
    }
}
