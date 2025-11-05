import java.util.HashMap;
import java.util.Map;

public class ElevatorSystemServiceImpl implements ElevatorSystem{
    HashMap<Integer,Integer> lift=new HashMap<>();
    Integer floorValue=0,peopleCount=0;
    boolean openDoor=false;
    @Override
    public void OpenDoor() {
        this.openDoor=true;
    }

    @Override
    public void CloseDoor() {
        this.openDoor=false;
    }

    @Override
    public void CheckIn() {
        if(openDoor) {
            if(this.peopleCount<15) {
                this.peopleCount+=1;
                lift.clear();
                lift.put(this.floorValue,this.peopleCount);
            }
            else {
                System.out.println("Maximum weight threshold have reached");
            }
        }
        else {
            System.out.println("Door is closed");
        }
    }

    @Override
    public void CheckOut() {
        if(openDoor) {
            if(this.peopleCount>0) {
                this.peopleCount-=1;
                lift.clear();
                lift.put(this.floorValue,this.peopleCount);
            }
            else {
                System.out.println("There is no one left");
            }
        }
        else {
            System.out.println("Door is closed");
        }
    }

    @Override
    public void Upward() {
        if(!openDoor) {
            if (this.floorValue < 10) {
                this.floorValue += 1;
                lift.clear();
                lift.put(this.floorValue,this.peopleCount);
            } else {
                System.out.println("Lift is already in the top floor");
            }
        }
        else {
            System.out.println("Door is not closed to move upward");
        }
    }

    @Override
    public void Downward() {
        if(!openDoor) {
            if (this.floorValue > 0) {
                this.floorValue -= 1;
                lift.clear();
                lift.put(this.floorValue,this.peopleCount);
            } else {
                System.out.println("Lift is already in the ground floor");
            }
        }
        else {
            System.out.println("Door is not closed to move Downward");
        }
    }

    @Override
    public void DisplayLiftMetrics() {
        for(Map.Entry<Integer,Integer> entry : lift.entrySet()) {
            System.out.println("Floor : "+entry.getKey()+" , PeopleCount : "+entry.getValue());
        }
    }
}
