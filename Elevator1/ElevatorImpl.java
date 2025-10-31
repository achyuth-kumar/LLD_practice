import java.util.HashMap;
import java.util.Map;

public class ElevatorImpl implements Elevator{
    HashMap<Integer,Integer> lift=new HashMap<>();
    public Integer PeopleCount=0,CAPACITY=15,floor=0;
    public Boolean DoorOpened=false;
    @Override
    public void OpenDoor() {
        this.DoorOpened=true;
    }

    @Override
    public void CloseDoor() {
        this.DoorOpened=false;
    }

    @Override
    public void CheckIn() {
        if(this.DoorOpened) {
            if (this.PeopleCount < CAPACITY) {
                this.PeopleCount += 1;
                lift.clear();
                lift.put(this.floor,this.PeopleCount);
            } else {
                System.out.println("Max number of people limit exhausted");
            }
        }
        else {
            System.out.println("Door is closed");
        }
    }

    @Override
    public void CheckOut() {
        if(this.DoorOpened) {
            this.PeopleCount -= 1;
            lift.clear();
            lift.put(this.floor,this.PeopleCount);
        }
        else {
            System.out.println("Door is closed");
        }
    }

    @Override
    public void Upward() {
        this.floor+=1;
        if(this.floor<10) {
            lift.clear();
            lift.put(this.floor,this.PeopleCount);
        }
        else {
            System.out.println("Lift is in top floor");
        }
    }

    @Override
    public void Downward() {
        this.floor-=1;
        if(this.floor>=0) {
            lift.clear();
            lift.put(this.floor,this.PeopleCount);
        }
        else {
            System.out.println("Lift is in ground floor");
        }
    }
    @Override
    public void DisplayLiftMetrics() {
        System.out.println("Lift details : ");
        for(Map.Entry<Integer,Integer> entry : lift.entrySet()) {
            System.out.println("Floor : "+entry.getKey()+" : people :  "+entry.getValue());
        }
    }
}
