public interface ElevatorSystem {
    public void CheckIn();
    public void CheckOut();
    public void OpenDoor();
    public void CloseDoor();
    public void Upward();
    public void Downward();
    public void DisplayLiftMetrics(String liftName);
}
