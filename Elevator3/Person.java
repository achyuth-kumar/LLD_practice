public class Person {
    public Integer id;
    public String name;
    public Elevator elevator;

    public Person(Integer id, String name, Elevator elevator) {
        this.id = id;
        this.name = name;
        this.elevator = elevator;
    }


    public void OpenDoor() {
        elevator.OpenDoor();
    }
    public void CloseDoor() {
        elevator.CloseDoor();
    }
    public void CheckIn() {
        elevator.CheckIn();
    }
    public void CheckOut() {
        elevator.CheckOut();
    }

}
