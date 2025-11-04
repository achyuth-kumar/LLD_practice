import java.util.concurrent.atomic.AtomicLong;

public class TokenBucketServiceImpl implements TokenBucket{
    AtomicLong CurrentToken,lastRefillToken;
    Long Capacity,RefillRate;
    TokenBucketServiceImpl(Long Capacity,Long RefillRate) {
        CurrentToken=new AtomicLong(Capacity);
        lastRefillToken=new AtomicLong(System.currentTimeMillis());
        this.Capacity=Capacity;
        this.RefillRate=RefillRate;
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
    public boolean TryConsumebucket() {
        RefillToken();
        if(CurrentToken.get()>0) {
            CurrentToken.decrementAndGet();
            return true;
        }
        return false;
    }

    @Override
    public Long GetCurrentToken() {
        RefillToken();
        return CurrentToken.get();
    }
}
