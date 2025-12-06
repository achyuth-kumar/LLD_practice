public interface Chat {
    public void sendMessage(User sender,String message);
    public void deleteMessage(String message);
    public void pinMessage(String message);
    public void viewMessage();
}
