import java.util.HashMap;
import java.util.Map;

public class ElevatorImpl implements Elevator{
    HashMap<Integer,Integer> lift;
    ElevatorImpl() {
        lift=new HashMap<>();
    }
    boolean doorOpened=false;
    Integer MAX_CAPACITY=10,floor=0,People_Count=0;
    @Override
    public void OpenDoor() {
        this.doorOpened=true;
    }

    @Override
    public void CloseDoor() {
        this.doorOpened=false;
    }

    @Override
    public boolean ValidateSpace() {
        return this.People_Count<MAX_CAPACITY;
    }

    @Override
    public void CheckIn() {
        if(this.doorOpened) {
            if(this.ValidateSpace()) {
                lift.clear();
                lift.put(this.floor, this.People_Count + 1);
                this.People_Count = lift.get(this.floor);
            }
            else {
                System.out.println("Max capacity have been reached");
            }
        }
        else {
            System.out.println("Door is closed");
        }
    }

    @Override
    public void CheckOut() {
        if(this.doorOpened) {
            lift.clear();
            lift.put(this.floor, this.People_Count-1);
            this.People_Count =lift.get(this.floor);
        }
        else {
            System.out.println("Door is closed");
        }
    }

    @Override
    public void Upward() {
        if(this.floor<10) {
            this.floor+=1;
        }
        else {
            System.out.println("Lift is already in top floor");
        }
    }

    @Override
    public void Downward() {
        if(this.floor>0) {
            this.floor -= 1;
        }
        else {
            System.out.println("Lift is already in ground floor");
        }
    }

    @Override
    public void DisplayElevatorMetrics() {
        System.out.println("Lift Metrics : ");
        for(Map.Entry<Integer,Integer> entry : lift.entrySet()) {
            System.out.println("Floor : "+entry.getKey()+" :  People : "+entry.getValue());
        }
    }
}
