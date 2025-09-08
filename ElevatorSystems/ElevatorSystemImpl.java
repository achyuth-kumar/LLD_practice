import java.util.HashSet;

public class ElevatorSystemImpl implements ElevatorSystem{
    public int floor=5;
    public boolean doorOpen=false,up=true;
    HashSet<Integer> peopleSize=new HashSet<Integer>();
    public int power=0;
    ElevatorSystemImpl(int power) {
        this.power=power;
    }
    @Override
    public void Upside() {
        this.up=!up;
        System.out.println("Lift is going upside");
    }

    @Override
    public void DownSide() {
        this.up=!up;
        System.out.println("Lift is going downside");
    }


    @Override
    public void OpenDoor() {
        this.doorOpen=true;
    }

    @Override
    public void CloseDoor() {
            this.doorOpen=false;
    }

    @Override
    public void Enter(User user) {
        if(this.doorOpen) {
            if(this.peopleSize.size()>7) {
                System.out.println("Lift is full");
            }
            else {
                System.out.println("Please Get-IN : " + user.getName());
                this.peopleSize.add(user.getId());
            }
        }
        else {
            System.out.println("Door is not open");
        }
    }

    @Override
    public void Exit(User user) {
        if(this.doorOpen) {
            System.out.println("You can exit : "+user.getName());
            this.peopleSize.remove(user.getId());
        }
        else {
            System.out.println("Door is not open");
        }
    }

    @Override
    public int getPowerStatus() {
        return this.power;
    }
    public void setPowerStatus(int power) {
        this.power=power;
    }
}
