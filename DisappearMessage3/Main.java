public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth");
        Chat chat=new Chat();
        chat.openChat();
        if(chat.isOpened()) {
            Message message = new Message();
            message.sendMessage("Hello");
            message.sendMessage("World");
            message.sendMessage("Bangalore");
            message.sendMessage("Raichur");
            message.sendMessage("Mangalore");
            message.sendMessage("C++");
            message.sendMessage("Java");
            message.sendMessage("CSharp");
            DisappearingMessage disappearingMsg = new DisappearingMessage(4,message);
            disappearingMsg.startTime(1);
            disappearingMsg.endTime(6);
            disappearingMsg.disappearMessage();
            message.displayMessage();
        }
    }
}
