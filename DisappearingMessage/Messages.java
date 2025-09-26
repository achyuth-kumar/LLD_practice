import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Messages {
    public int messageId;
    public HashMap<Integer,String> messages=new HashMap<>();
    public void sendMessage(Integer messageId,String input) {
        messages.put(messageId,input);
    }
    public void recieveMessage(Integer messageId) {
        if(messages.containsKey(messageId)) {
            System.out.println("Reading message : "+messages.get(messageId));
        }
        else {
            System.out.println("Invalied message ID  "+ messageId);
        }
    }
    public void deleteMessage(Integer messageId) {
        if(messages.containsKey(messageId)) {
            System.out.println(messages.get(messageId)+" : message deleted");
            messages.remove(messageId);
        }
        else {
            System.out.println("Invalid messageID for deletion : "+messageId);
        }
    }
    public void displayMessages(){
        System.out.println("All messages");
        for(Map.Entry<Integer,String> entry : messages.entrySet()) {
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
    }
}
