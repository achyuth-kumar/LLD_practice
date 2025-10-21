import java.awt.*;
import java.util.concurrent.atomic.AtomicLong;

public class RateLimiterImpl implements RateLimiter{
    public long Capacity,RefillRate;
    AtomicLong CurrentTokens,LastRefillTokens;
    RateLimiterImpl(long Capacity,long RefillRate) {
        this.Capacity=Capacity;
        this.RefillRate=RefillRate;
        CurrentTokens=new AtomicLong(Capacity);
        LastRefillTokens=new AtomicLong(System.currentTimeMillis());
    }
    @Override
    public void RefillTokens() {
        long now=System.currentTimeMillis();
        long timeElapsed=now-LastRefillTokens.get();
        if(timeElapsed>0) {
            long tokensToAdd=(timeElapsed*RefillRate)/1000;
            if(tokensToAdd>0) {
                CurrentTokens.updateAndGet(current->Math.min(Capacity,current+tokensToAdd));
                LastRefillTokens.set(now);
            }
        }
    }

    @Override
    public long getCurrentTokens() {
        RefillTokens();
        return CurrentTokens.get();
    }

    @Override
    public boolean tryConsumeBucket() {
        RefillTokens();
        if(CurrentTokens.get()>0) {
            CurrentTokens.decrementAndGet();
            return true;
        }
        return false;
    }
}
