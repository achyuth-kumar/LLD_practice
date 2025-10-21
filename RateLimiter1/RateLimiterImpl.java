import java.util.concurrent.atomic.AtomicLong;

public class RateLimiterImpl implements  RateLimiter{
    AtomicLong CurrentBucket;
    AtomicLong LastRefillTokens;
    public int Capacity,RefillRate;
    RateLimiterImpl(int Capacity,int RefillRate) {
        this.Capacity=Capacity;
        this.RefillRate=RefillRate;
        CurrentBucket=new AtomicLong(Capacity);
        LastRefillTokens=new AtomicLong(System.currentTimeMillis());
    }
    @Override
    public void RefillTokens() {
        long now = System.currentTimeMillis();
        long timeElapsed=now-LastRefillTokens.get();
        if(timeElapsed>0) {
            long tokensToAdd=(timeElapsed*RefillRate)/1000;
            if(tokensToAdd>0) {
                CurrentBucket.updateAndGet(Current->Math.min(Capacity,Current+tokensToAdd));
                LastRefillTokens.set(now);
            }
        }
    }

    @Override
    public long GetCurrentTokens() {
        RefillTokens();
        return CurrentBucket.get();
    }

    @Override
    public boolean TryConsumeToken() {
        RefillTokens();
        if(CurrentBucket.get()>0) {
            CurrentBucket.decrementAndGet();
            return true;
        }
        return false;
    }
}
