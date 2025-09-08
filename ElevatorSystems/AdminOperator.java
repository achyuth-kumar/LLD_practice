public class AdminOperator {
    ElevatorSystemImpl elevatorSystem;
    AdminOperator(ElevatorSystemImpl elevatorSystem) {
        this.elevatorSystem=elevatorSystem;
    }
    public void turnOn() {
        elevatorSystem.setPowerStatus(1);
    }
    public void turnOff() {
        elevatorSystem.setPowerStatus(0);
    }

}
