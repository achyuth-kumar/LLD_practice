public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth",new Chat());
        user.openChat();
        Messages message=new Messages();
        message.sendMessage(1,"Hello World!!");
        message.recieveMessage(1);
        message.sendMessage(2,"Welcome to C++");
        message.recieveMessage(2);
        message.sendMessage(3,"Welcome to Bangalore");
        message.recieveMessage(3);
        DisappearingMessage disappearingMessage=new DisappearingMessage(message);
        disappearingMessage.isExpiry(1);
        message.displayMessages();
    }
}
