import java.util.HashMap;
import java.util.Map;

public class ElevatorServiceImpl implements ElevatorSystem{
    HashMap<Integer,Integer> lift;
    Integer floorCount=0,peopleCount=0;
    boolean openDoor=false;
    ElevatorServiceImpl() {
        lift=new HashMap<>();
    }
    @Override
    public void CheckIn() {
        if(openDoor) {
            if(this.peopleCount<15) {
                this.peopleCount+=1;
                lift.clear();
                lift.put(this.floorCount,this.peopleCount);
            }
            else {
                System.out.println("Maximum weight limit have exhausted");
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
                lift.put(this.floorCount,this.peopleCount);
            }
            else {
                System.out.println("There is no left out in the lift");
            }
        }
        else {
            System.out.println("Door is closed");
        }
    }

    @Override
    public void OpenDoor() {
        this.openDoor=true;
    }

    @Override
    public void CloseDoor() {
        this.openDoor=false;
    }

    @Override
    public void Upward() {
        if(!openDoor) {
            if(this.floorCount<10) {
                this.floorCount+=1;
                lift.clear();
                lift.put(this.floorCount,this.peopleCount);
            }
            else{
                System.out.println("lift is in top floor");
            }
        }
        else {
            System.out.println("Door should be closed while moving upward");
        }
    }

    @Override
    public void Downward() {
        if(!openDoor) {
            if(this.floorCount>0) {
                this.floorCount-=1;
                lift.clear();
                lift.put(this.floorCount,this.peopleCount);
            }
            else{
                System.out.println("lift is in ground floor");
            }
        }
        else {
            System.out.println("Door should be closed while moving downward");
        }
    }

    @Override
    public void DisplayLiftMetrics(String liftName) {
        System.out.println(liftName+ " : lift metrics ");
        for(Map.Entry<Integer,Integer> entry : lift.entrySet()) {
            System.out.println("Floor : "+entry.getKey()+" : People count: "+entry.getValue());
        }
    }
}
