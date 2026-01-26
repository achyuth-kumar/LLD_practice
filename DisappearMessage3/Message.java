import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Message {
    public HashMap<String,Integer> messages;
    public Integer timeStamp;
    public Message() {
        messages=new HashMap<>();
        this.timeStamp = 0;
    }

    public void sendMessage(String message) {
            messages.put(message,timeStamp);
            timeStamp+=1;
    }
    public void deleteMessage(String message) {
        messages.remove(message);
    }
    public void deleteThroughDisappear(Integer startTime,Integer endTime) {
        List<String> deletedMessages=new ArrayList<>();
        for(Map.Entry<String,Integer> entry : messages.entrySet()) {
            if(entry.getValue()>=startTime && entry.getValue()<=endTime) {
                deletedMessages.add(entry.getKey());
            }
        }
        for(String message : deletedMessages) {
            this.messages.remove(message);
        }
    }
    public void displayMessage() {
        System.out.println("Messages : ");
        for(Map.Entry<String,Integer> entry : messages.entrySet()) {
            System.out.println(entry.getKey()+ " , "+entry.getValue());
        }
    }
    public void pinMessage(String message) {
        System.out.println("Pinned message : "+message);
    }
}
