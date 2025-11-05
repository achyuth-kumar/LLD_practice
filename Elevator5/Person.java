public class Person {
    public Integer id;
    public String name;
    public ElevatorSystemServiceImpl elevatorSystemService;

    public Person(Integer id, String name, ElevatorSystemServiceImpl elevatorSystemService) {
        this.id = id;
        this.name = name;
        this.elevatorSystemService = elevatorSystemService;
    }


    public void OpenDoor() {
        elevatorSystemService.OpenDoor();
    }
    public void CloseDoor() {
        elevatorSystemService.CloseDoor();
    }
    public void CheckIn() {
        elevatorSystemService.CheckIn();
    }
    public void CheckOut() {
        elevatorSystemService.CheckOut();
    }

}
