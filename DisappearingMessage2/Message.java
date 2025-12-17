import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Message {

    public Integer id,time;
    public HashMap<Integer,String> messages;

    public Message(Integer id) {
        this.id = id;
        this.time=0;
        this.messages = new HashMap<>();
    }
    public void sendMessage(String message) {
        messages.put(time++,message);
    }
    public void deleteAllMessage() {
        messages.clear();
    }
    public void pinMessage(String message) {
        System.out.println("Pinned message : "+message);
    }
    public HashMap<Integer,String> getMessages() {
        return this.messages;
    }


}
