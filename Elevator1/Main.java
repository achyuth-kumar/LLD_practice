public class Main {
    public static void main(String [] args) {
        Elevator elevator=new ElevatorImpl();
        elevator.OpenDoor();
        Person person=new Person(1,"Achyuth", (ElevatorImpl) elevator);
        person.CheckIn();
        person.CheckIn();
        person.CheckIn();
        person.CheckIn();
        elevator.DisplayLiftMetrics(); // floor - 0 , people -4

        elevator.Upward();
        person.CheckIn();
        elevator.DisplayLiftMetrics(); // floor - 1 , people - 5

        elevator.Downward();
        person.CheckOut();
        elevator.DisplayLiftMetrics();//floor - 0 , people - 4


        elevator.Upward();
        person.CheckIn();
        person.CheckIn();
        person.CheckIn();
        elevator.DisplayLiftMetrics(); // floor - 1 , people - 7

    }

}
