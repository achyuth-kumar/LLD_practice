import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoUnit;

public class DisappearingMessage {
    public static int TTL=3;
    Messages message;
    DisappearingMessage(Messages message) {
        this.message=message;
    }
    public void isExpiry(Integer messageId) {
        LocalTime startTime=LocalTime.now();
        LocalTime endTime=LocalTime.now().plus(4, ChronoUnit.HOURS);
        if(Math.abs(Duration.between(endTime,startTime).getSeconds())>=TTL) {
            message.deleteMessage(messageId);
        }
        else {
            System.out.println("Message not expired");
        }
    }

}
