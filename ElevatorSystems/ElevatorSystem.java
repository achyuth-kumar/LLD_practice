public interface ElevatorSystem {
    public void Upside();
    public void DownSide();
    public void OpenDoor();
    public void CloseDoor();
    public void Enter(User user);
    public void Exit(User user);
    public int getPowerStatus();
}
