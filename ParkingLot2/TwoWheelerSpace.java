import java.util.HashMap;

public class TwoWheelerSpace implements ParkingSpaceType{

    HashMap<Integer,Boolean> slots;
    Integer in,out,index;
    public TwoWheelerSpace(HashMap<Integer, Boolean> slots) {
        this.slots = slots;
        this.in=0;
        this.out=0;
        this.index=0;
    }

    @Override
    public void CheckIn(Integer in) {
        if(this.index<slots.size()) {
            slots.put(index, true);
            this.index += 1;
            this.in = in;
        }
        else {
            System.out.println("No Vacant space for Two Wheeler");
        }
    }

    @Override
    public void CheckOut(Integer out) {
        this.out=out;
        slots.put(index,false);
    }

    @Override
    public boolean GetAvailability() {
        if(slots.get(this.index)) {
            return false;
        }
        return true;
    }

    @Override
    public Integer cost() {
        return (out-in)*10;
    }
}
