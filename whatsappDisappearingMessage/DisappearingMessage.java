import java.time.LocalDateTime;

public class DisappearingMessage {
    public int TTL=5; //SECONDS
    Chat chat;
    DisappearingMessage(Chat chat) {
        this.chat=chat;
    }
    public boolean isExpiry() {
        LocalDateTime start=turnOn();
        LocalDateTime end=turnOff();
        System.out.println("Turning on dissappearing message at : "+start);
        System.out.println("Turning off dissappearing message at : "+end);
        if(Math.abs(end.getSecond()-start.getSecond())>=TTL) {
            return true;
        }
        return false;
    }
    public LocalDateTime turnOn() {
        LocalDateTime time=LocalDateTime.now();
        return time;
    }
    public LocalDateTime turnOff() {
        LocalDateTime time=LocalDateTime.now().plusSeconds(30);
//        LocalDateTime time=LocalDateTime.now().plusSeconds(0);
        return time;
    }
}
