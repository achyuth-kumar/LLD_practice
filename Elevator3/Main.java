public class Main {
    public static void main(String[] args) {
        Elevator elevator=new Elevator(15);
        Person person=new Person(1,"Achyuh",elevator);
        person.OpenDoor();
        person.CheckIn();
        person.CheckIn();
        person.CheckIn();
        person.CloseDoor();
        elevator.DisplayLiftMetrics(); // floor : 0 , people : 3

        elevator.Upward();
        person.OpenDoor();
        person.CheckIn();
        person.CheckIn();
        person.CloseDoor();

        elevator.DisplayLiftMetrics(); // floor : 1 , people : 5
    }
}
