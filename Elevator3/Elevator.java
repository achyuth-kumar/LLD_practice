import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Elevator {
    HashMap<Integer,Integer> lift;
    Integer floor,peopleCount,capacity;
    boolean doorOpened;
    Elevator(Integer capacity) {
        this.floor=0;
        this.peopleCount=0;
        this.doorOpened=false;
        this.capacity=capacity;
        lift=new HashMap<>();
    }
    public void OpenDoor() {
        this.doorOpened=true;
    }
    public void CloseDoor() {
        this.doorOpened=false;
    }
    public void CheckIn() {
        if(doorOpened) {
            if(this.peopleCount<capacity) {
                this.peopleCount+=1;
                lift.clear();
                lift.put(this.floor,this.peopleCount);
            }
            else {
                System.out.println("People count exhausted");
            }
        }
        else {
            System.out.println("Door is closed");
        }
    }
    public void CheckOut() {
        if(doorOpened) {
            if(this.peopleCount>0) {
                this.peopleCount-=1;
                lift.clear();
                lift.put(this.floor,this.peopleCount);
            }
            else {
                System.out.println("There are no people");
            }
        }
        else {
            System.out.println("Door is closed");
        }
    }
    public void Upward() {
        if(!doorOpened) {
            this.floor+=1;
            if(floor<10) {
                lift.clear();
                lift.put(this.floor,this.peopleCount);
            }
            else {
                System.out.println("Lift is in top floor");
            }
        }
        else {
            System.out.println("Door should be closed while moving upward");
        }
    }
    public void Downward() {
        if(!doorOpened) {
            this.floor-=1;
            if(floor>0) {
                lift.clear();
                lift.put(this.floor,this.peopleCount);
            }
            else {
                System.out.println("Lift is in ground floor");
            }
        }
        else {
            System.out.println("Door should be closed while moving upward");
        }
    }
    public void DisplayLiftMetrics() {
        for(Map.Entry<Integer,Integer> entry : lift.entrySet()) {
            System.out.println("Floor : "+entry.getKey()+" , people count : "+entry.getValue());
        }
    }
}

