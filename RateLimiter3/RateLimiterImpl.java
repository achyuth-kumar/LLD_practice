import java.util.concurrent.atomic.AtomicLong;

public class RateLimiterImpl implements RateLimiter{
    public int Capacity,RefillRate;
    AtomicLong CurrentTokens,LastRefillToken;
    RateLimiterImpl(int Capacity,int RefillRate) {
        this.Capacity=Capacity;
        this.RefillRate=RefillRate;
        CurrentTokens=new AtomicLong(Capacity);
        LastRefillToken=new AtomicLong(System.currentTimeMillis());
    }
    @Override
    public void RefillTokens() {
        long now = System.currentTimeMillis();
        long timeElapsed=now - LastRefillToken.get();
        if(timeElapsed>0) {
            long tokensToAdd=(timeElapsed*RefillRate)/1000;
            if(tokensToAdd>0) {
                CurrentTokens.updateAndGet(current->Math.max(Capacity,current+tokensToAdd));
                LastRefillToken.set(now);
            }
        }
    }

    @Override
    public boolean TryConsumeBuckets() {
        RefillTokens();
        if(CurrentTokens.get()>0) {
            CurrentTokens.decrementAndGet();
            return true;
        }
        return false;
    }

    @Override
    public long GetCurrentToken() {
        RefillTokens();
        return CurrentTokens.get();
    }
}
