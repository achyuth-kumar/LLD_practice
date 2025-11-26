public class Chat {
    public Integer id;
    public String name;
    public Message message;

    public Chat(Integer id, String name, Message message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    public void openChat() {
        System.out.println("chat opened");
    }
    public void closeChat() {
        System.out.println("chat closed");
    }
    public void sendMessage(String input) {
        message.sendMessage(input);
    }
    public void deleteMessage(String input) {
        message.deleteMessage(input);
    }
    public void pinMessage(Integer index) {
        message.pinMessage(index);
    }
    public void turnOnDisappearing() {
        message.turnOnDisappearingMessage();
    }
    public void turnOffDisappearing() {
        message.turnOffDisappearingMessage();
    }
    public void displayMessages() {
        message.displayMessages();
    }
    public void disappearMessage() {
        message.disappearMessage();
    }

}
