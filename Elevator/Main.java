public class Main {
    public static void main(String [] args) {
        Elevator elevator=new ElevatorImpl();
        elevator.OpenDoor();
        if(elevator.ValidateSpace()) {
            elevator.CheckIn();
            elevator.CheckIn();
            elevator.CheckIn();
            elevator.CheckIn();
            elevator.DisplayElevatorMetrics();

            elevator.CheckOut();
            elevator.CheckOut();
            elevator.DisplayElevatorMetrics();

            elevator.Upward();
            elevator.CheckIn();
            elevator.CheckIn();
            elevator.DisplayElevatorMetrics();


            elevator.Upward();
            elevator.CheckIn();
            elevator.CheckIn();
            elevator.CheckIn();
            elevator.CheckIn();
            elevator.CheckIn();
            elevator.DisplayElevatorMetrics();

            elevator.Downward();
            elevator.CheckOut();
            elevator.DisplayElevatorMetrics();
        }
        else {
            System.out.println("Max capacity have been reached");
        }
    }
}
