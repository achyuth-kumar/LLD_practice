import java.time.LocalDateTime;

public class DisappearingMessage {
    public LocalDateTime startTime,endTime;
    public long TTL;
    public DisappearingMessage() {
        this.TTL = 5;
    }
    public boolean processDisappearing(LocalDateTime startTime,LocalDateTime endTime) {
        return (Math.abs(endTime.getSecond()-startTime.getSecond())>=TTL);
    }


}
