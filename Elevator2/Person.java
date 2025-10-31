public class Person {
    public Integer id;
    public String name;
    public ElevatorServiceImpl elevatorService;
    public Person(Integer id, String name,ElevatorServiceImpl elevatorService) {
        this.id = id;
        this.name = name;
        this.elevatorService=elevatorService;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void OpenDoor() {
        elevatorService.OpenDoor();
    }
    public void CloseDoor() {
        elevatorService.CloseDoor();
    }
    public void CheckIn(){
        elevatorService.CheckIn();
    }
    public void CheckOut() {
        elevatorService.CheckOut();
    }
}
