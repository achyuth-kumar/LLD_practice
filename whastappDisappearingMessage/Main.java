public class Main {
    public static void main(String[] args) {
        User user=new User();
        Chat chat=user.openChat();
        DisappearingMessage disappearingMessage=new DisappearingMessage(chat);
        if(chat!=null) {
            chat.sendMessage("Hi");
            chat.sendMessage("Hello");
            chat.sendMessage("Coding");
            chat.pinMessage("Coding0");
            chat.pinMessage("Coding");
            System.out.println("Before disappearing message : ");
            chat.displayAllMessages();
            disappearingMessage.turnOn();
            disappearingMessage.turnOff();
            if(disappearingMessage.isExpiry()) {
                chat.deleteMessage();
            }
            System.out.println("After disappearing message : ");
            chat.displayAllMessages();
        }
    }
}
