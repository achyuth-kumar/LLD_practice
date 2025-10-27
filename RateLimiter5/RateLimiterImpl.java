import java.util.concurrent.atomic.AtomicLong;

public class RateLimiterImpl implements  RateLimiter{
    AtomicLong CurrentToken,LastRefillToken;
    public Integer Capacity,RefillRate;
    RateLimiterImpl(Integer Capacity,Integer RefillRate) {
        this.Capacity=Capacity;
        this.RefillRate=RefillRate;
        CurrentToken=new AtomicLong(Capacity);
        LastRefillToken=new AtomicLong(System.currentTimeMillis());
    }

    @Override
    public void RefillToken() {
        long now=System.currentTimeMillis();
        long timeElapsed=now-LastRefillToken.get();
        if(timeElapsed>0) {
            long TokensToAdd=(timeElapsed*RefillRate)/1000;
            if(TokensToAdd>0) {
                CurrentToken.updateAndGet(Current->Math.max(Current,Current+TokensToAdd));
                LastRefillToken.set(now);
            }
        }
    }

    @Override
    public boolean TryConcumeBucket() {
        RefillToken();
        if(CurrentToken.get()>0) {
            CurrentToken.decrementAndGet();
            return true;
        }
        return false;
    }

    @Override
    public long GetCurrentToken() {
        RefillToken();
        return CurrentToken.get();
    }
}
