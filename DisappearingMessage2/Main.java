import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth");
        Chat chat=new Chat(1,"Casual");
        chat.openChat();
        if(chat.isOpen()) {
            Message message = new Message(1);
            message.sendMessage("Hi Achyuth");
            message.sendMessage("Welcome to Java");
            message.sendMessage("SDE interview");
            message.sendMessage("Happy Coding");
            message.sendMessage("Welcome to Gangavathi");
            message.sendMessage("C++");
            message.sendMessage("SQL");

            System.out.println("Messages before : ");
            HashMap<Integer,String>msg=message.getMessages();
            for(Map.Entry<Integer,String> entry : msg.entrySet()) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
            DisappearingMessage dm = new DisappearingMessageServiceImpl(3, 1, 5, message);
            dm.disappearMessage();
            System.out.println("Messages after : ");
            msg=message.getMessages();
            for(Map.Entry<Integer,String> entry : msg.entrySet()) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
        else {
            System.out.println("Chat is closed");
        }
    }
}
