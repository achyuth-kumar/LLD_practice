public class Main {
    public static void main(String [] args) {
        Elevator elevator=new ElevatorServiceImpl();
        Person person=new Person(1,"Achyuth", (ElevatorServiceImpl) elevator);
        person.OpenDoor();
        person.CheckIn();
        person.CheckIn();
        person.CheckIn();
        person.CheckIn();
        person.CheckIn();
        elevator.DisplayLiftMetrics(); // floor - 0 , people - 5

        person.CloseDoor();
        elevator.Upward();
        person.OpenDoor();
        person.CheckIn();
        person.CheckIn();
        elevator.DisplayLiftMetrics(); // floor - 1 , people - 7

        person.CloseDoor();
        elevator.Downward();
        person.OpenDoor();
        person.CheckOut();
        person.CheckOut();
        person.CheckOut();
        elevator.DisplayLiftMetrics();// floor - 0 , people - 4
    }
}
