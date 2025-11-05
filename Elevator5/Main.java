public class Main {
    public static void main(String [] args) {
        ElevatorSystem elevatorSystem=new ElevatorSystemServiceImpl();
        Person person=new Person(1,"Achyuth", (ElevatorSystemServiceImpl) elevatorSystem);
        person.OpenDoor();
        person.CheckIn();
        person.CheckIn();
        person.CheckIn();
        elevatorSystem.DisplayLiftMetrics(); //floor : 0 , PeopleCount : 3

        person.CloseDoor();
        elevatorSystem.Upward();
        person.OpenDoor();
        person.CheckIn();
        person.CheckIn();
        elevatorSystem.DisplayLiftMetrics(); //floor : 1 , PeopleCount : 5

        person.CloseDoor();
        elevatorSystem.Downward();
        person.OpenDoor();
        person.CheckOut();
        elevatorSystem.DisplayLiftMetrics();//floor : 0 , PeopleCount : 4
    }
}
