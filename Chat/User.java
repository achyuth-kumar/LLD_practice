public interface User {
    public void SendMessage(String message,User TargetUser);
    public void sendAll(String message);
    public void RecieveMessage(String message);
    public void DeleteMessage(String message);
    public void PinMessage(String message);
    public void DisplayMessages();
}
