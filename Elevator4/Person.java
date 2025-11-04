public class Person {
    public Integer id;
    public String name;
    ElevatorServiceImpl elevatorService;

    public Person(Integer id, String name, ElevatorServiceImpl elevatorService) {
        this.id = id;
        this.name = name;
        this.elevatorService = elevatorService;
    }
    public void OpenDoor() {
        elevatorService.OpenDoor();
    }
    public void CloseDoor() {
        elevatorService.CloseDoor();
    }
    public void CheckIn() {
        elevatorService.CheckIn();
    }
    public void ChekOut() {
        elevatorService.CheckOut();
    }

}
