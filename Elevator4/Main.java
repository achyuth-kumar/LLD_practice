public class Main {
    public static void main(String [] args) {
        ElevatorSystem elevatorSystem1=new ElevatorServiceImpl();
        Person person=new Person(1,"Achyuth", (ElevatorServiceImpl) elevatorSystem1);
        person.OpenDoor();
        person.CheckIn();
        person.CheckIn();
        person.CheckIn();
        elevatorSystem1.DisplayLiftMetrics("lift-1"); // floor : 0 , PeopleCount : 3

        person.CloseDoor();
        elevatorSystem1.Upward();
        person.OpenDoor();
        person.CheckIn();
        person.CheckIn();
        elevatorSystem1.DisplayLiftMetrics("lift-1"); // floor : 1 , PeopleCount : 5

        ElevatorSystem elevatorSystem2=new ElevatorServiceImpl();
        Person person2=new Person(2,"Kumar", (ElevatorServiceImpl) elevatorSystem2);
        person2.OpenDoor();
        person2.CheckIn();
        person2.CheckIn();
        elevatorSystem2.DisplayLiftMetrics("lift-2"); // floor : 0 , PeopleCount : 2

    }
}
