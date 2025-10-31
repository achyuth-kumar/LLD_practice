import java.util.HashMap;
import java.util.Map;

public class ElevatorServiceImpl implements Elevator{
    HashMap<Integer,Integer> lift;
    public Boolean OpenDoor;
    public Integer floor=0,peopleCount=0,Capacity=10;
    ElevatorServiceImpl() {
        this.OpenDoor=false;
        lift=new HashMap<>();
    }
    @Override
    public void OpenDoor() {
        this.OpenDoor=true;
    }

    @Override
    public void CloseDoor() {
        this.OpenDoor=false;
    }

    @Override
    public void CheckIn() {
        if(this.OpenDoor) {
            if (this.peopleCount < Capacity) {
                this.peopleCount += 1;
                lift.clear();
                lift.put(this.floor, this.peopleCount);

            } else {
                System.out.println("Maximum capacity have been reached");
            }
        }
        else {
            System.out.println("Door is closed, to CheckIn");
        }
    }

    @Override
    public void CheckOut() {
        if(this.OpenDoor) {
            if (this.peopleCount > 0) {
                this.peopleCount -= 1;
                lift.clear();
                lift.put(this.floor, this.peopleCount);
            }
        }
        else {
            System.out.println("Door is closed, to CheckOut");
        }
    }

    @Override
    public void Upward() {
        if(!this.OpenDoor) {
            this.floor += 1;
            if(this.floor<10) {
                lift.clear();
                lift.put(this.floor, this.peopleCount);
            }
            else {
                System.out.println("Lift is already in top floor");
            }
        }
        else {
            System.out.println("Door should be closed to move the lift");
        }
    }

    @Override
    public void Downward() {
        if(!this.OpenDoor) {
            this.floor-=1;
            if(this.floor>=0) {
                lift.clear();
                lift.put(this.floor, this.peopleCount);
            }
            else {
                System.out.println("Lift is in ground floor");
            }
        }
        else {
            System.out.println("Door should be closed to move the lift");
        }
    }

    @Override
    public void DisplayLiftMetrics() {
        for(Map.Entry<Integer,Integer> entry : lift.entrySet()) {
            System.out.println("floor : "+entry.getKey()+" , people count :  "+entry.getValue());
        }
    }
}
