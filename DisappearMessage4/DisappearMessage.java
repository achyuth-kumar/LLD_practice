import java.time.LocalDateTime;

public class DisappearMessage {
    public LocalDateTime startTime,endTime;
    public  Integer TTL;
    public Messages messages;
    public DisappearMessage(Messages messages) {
        this.TTL = 0;
        this.messages=messages;
    }

    public void turnOn(LocalDateTime startTime) {
//        this.startTime=LocalDateTime.now();
        this.startTime=startTime;
    }
    public void turnOff(LocalDateTime endTime) {
//        this.endTime=LocalDateTime.now();
        this.endTime=endTime;
    }
    public void isExpiry() {
        if(endTime.compareTo(startTime)>TTL) {
            messages.disappearMessage(startTime,endTime);
        }
        else {
            System.out.println("No expiry");
        }
    }

}
