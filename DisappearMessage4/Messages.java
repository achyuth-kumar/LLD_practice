import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Messages {

    public Integer id,time;
    public HashMap<String,Integer> messages;
    public Messages(Integer id) {
        this.id = id;
        this.time=0;
        this.messages=new HashMap<>();
    }

    public void sendMessage(String message){
        messages.put(message,time++);
    }
    public void deleteMessage(String message) {
        messages.remove(message);
        time++;
    }
    public void pinMessage(String message) {
        System.out.println("Pined Message : "+message);
    }
    public void disappearMessage(LocalDateTime startTime,LocalDateTime endTime) {
        List<String> deletedMessages=new ArrayList<>();
        for(Map.Entry<String,Integer> entry : messages.entrySet()) {
            if(entry.getValue()>=startTime.getHour() && entry.getValue()<=endTime.getHour()) {
                deletedMessages.add(entry.getKey());
            }
        }
        for(String s : deletedMessages) {
            messages.remove(s);
        }
    }
    public void viewMessages() {
        System.out.println("Chats of : "+id);
        for(Map.Entry<String,Integer> entry : messages.entrySet()) {
            System.out.println(entry.getKey()+" , "+entry.getValue());
        }
    }
}
