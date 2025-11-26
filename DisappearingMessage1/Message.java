import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Message {

    public Integer id,currentIndex,disappearIndex;
    public List<String> messages;
    DisappearingMessage disappearingMessage;
    boolean disappear;
    public Message(Integer id,DisappearingMessage disappearingMessage) {
        this.id = id;
        this.disappear=false;
        this.messages=new ArrayList<>();
        this.disappearIndex=-1;
        this.currentIndex=0;
        this.disappearingMessage=disappearingMessage;
    }
    public void sendMessage(String input) {
        System.out.println(input+" : messages sent");
        this.messages.add(input);
        this.currentIndex+=1;
    }
    public void deleteMessage(String input) {
        this.messages.remove(input);
        this.currentIndex-=1;
    }
    public void pinMessage(int index) {
        System.out.println("Pinned message : "+messages.get(index));
    }
    public void turnOnDisappearingMessage() {
        this.disappear=true;
        this.disappearIndex=currentIndex;
        System.out.println("Turning on disappearing messages");
    }
    public void disappearMessage() {
        if(this.disappear) {
            LocalDateTime startTime = LocalDateTime.now();
            LocalDateTime endTime = LocalDateTime.now().plusSeconds(45);
            if (disappearingMessage.processDisappearing(startTime, endTime)) {
                if (this.disappearIndex >= 0) {
                    List<String> deletedMessage=new ArrayList<>();
                    for (int i = disappearIndex; i < messages.size(); i++) {
                        deletedMessage.add(messages.get(i));
                    }
                    for (int i = 0; i < deletedMessage.size(); i++) {
                        messages.remove(deletedMessage.get(i));
                    }
                }
            }
        }
    }
    public void turnOffDisappearingMessage() {
        this.disappear=false;
        this.disappearIndex=-1;
        System.out.println("Turning off disappearing messages");
    }
    public void displayMessages() {
        System.out.println(messages);
    }
}
