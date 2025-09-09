import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CarServiceImpl implements Car{
    HashMap<Integer, List<Integer>> customerRides=new HashMap<>();
    HashMap<Integer, Boolean> seatAvailability=new HashMap<Integer, Boolean>();
    //0 1 2 3
    public boolean engineOn;
    public int rideStart,rideEnd,carPosition;
    CarServiceImpl() {
        this.rideStart=1;
        this.rideEnd=20;
        this.carPosition=1;
        this.engineOn=false;
    }

    @Override
    public void Start() {
        this.engineOn=true;
    }

    @Override
    public void Book(int customerId, int customerSource,int customerDestination) {
        if(this.engineOn) {
            if(customerSource>=rideStart && customerDestination<=rideEnd) {
                if (seatAvailability.size() < 4) {
                    List<Integer> rides = new ArrayList<>();
                    rides.add(customerSource);
                    rides.add(customerDestination);
                    customerRides.put(customerId, rides);
                    seatAvailability.put(customerId, false);
                    System.out.println("Ride booked for customer : "+customerId+" ["+customerSource+" : "+customerDestination+"]");
                } else {
                    System.out.println("No vacant seat");
                }
            }
            else {
                System.out.println("Try booking ride within car's Vicinity");
            }
        }
        else {
            System.out.println("Engine has to turn on");
        }
    }

    @Override
    public void Exit(int customerId) {
        if(!this.engineOn) {
            if (this.carPosition==customerRides.get(customerId).get(1)) {
                customerRides.remove(customerId);
                seatAvailability.put(customerId, true);
            }
            this.engineOn=!this.engineOn;
        }
        else {
            System.out.println("Engine has to turn on");
        }
    }

    @Override
    public int Cost(int customerId) {
        return (customerRides.get(customerId).get(1)-customerRides.get(customerId).get(0))*40;
    }



    @Override
    public void Stop() {
        this.engineOn=false;
    }

    @Override
    public void accelerate() {
        this.carPosition+=1;
    }
}
