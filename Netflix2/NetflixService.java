import java.time.LocalDateTime;

public interface NetflixService {
    public boolean getAvailability(Integer userId,Integer accountId,LocalDateTime startTime,LocalDateTime endTime);
    public void processBooking(Integer userId, Integer accountId, LocalDateTime startTime, LocalDateTime endTime);
    public void processPayment(Integer amount);
}
