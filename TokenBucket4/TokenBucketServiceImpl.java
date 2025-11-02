import java.util.concurrent.atomic.AtomicLong;

public class TokenBucketServiceImpl implements TokenBucket{
    AtomicLong CurrentToken,lastRefillToken;
    long Capacity,RefillRate;
    TokenBucketServiceImpl(long Capacity,long RefillRate) {
        this.Capacity=Capacity;
        this.RefillRate=RefillRate;
        CurrentToken=new AtomicLong(Capacity);
        lastRefillToken=new AtomicLong(System.currentTimeMillis());
    }

    @Override
    public void RefillToken() {
        long now=System.currentTimeMillis();
        long timeElapsed=now-lastRefillToken.get();
        if(timeElapsed>0) {
            long tokenToAdd=(timeElapsed*RefillRate)/1000;
            if(tokenToAdd>0) {
                CurrentToken.updateAndGet(current->Math.max(current,current+tokenToAdd));
                lastRefillToken.set(now);
            }
        }
    }

    @Override
    public boolean TryConsumeBucket() {
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
