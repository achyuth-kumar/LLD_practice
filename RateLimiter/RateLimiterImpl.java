import java.util.concurrent.atomic.AtomicLong;

public class RateLimiterImpl implements RateLimiter{
    public AtomicLong CurrentToken=new AtomicLong();
    public AtomicLong lastRefillTimeStamp=new AtomicLong();
    public int RefillRate,Capacity;
    RateLimiterImpl(int Capacity,int RefillRate) {
        this.RefillRate=RefillRate;
        this.Capacity=Capacity;
        this.CurrentToken=new AtomicLong(Capacity);
        this.lastRefillTimeStamp=new AtomicLong(System.currentTimeMillis());
    }
    @Override
    public boolean TryConsumeBucket() {
        RefillTockens();
        if(CurrentToken.get()>0) {
            CurrentToken.decrementAndGet();
            return true;
        }
        return false;
    }

    @Override
    public void RefillTockens() {
        long now = System.currentTimeMillis();
        long timeElapsed = now - lastRefillTimeStamp.get();
        if(timeElapsed>0) {
            long tokensToAdd=(timeElapsed*RefillRate)/1000;
            if(tokensToAdd>0) {
                CurrentToken.updateAndGet(cur-> Math.min(Capacity,tokensToAdd));
                lastRefillTimeStamp.set(now);
            }
        }
    }

    @Override
    public long GetCurrentTockens() {
        RefillTockens();
        return CurrentToken.get();
    }
}
