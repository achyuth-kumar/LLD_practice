import java.util.concurrent.atomic.AtomicLong;

public class TokenBucketServiceImpl implements TokenBucket{
    AtomicLong CurrentToken,lastRefillToken;
    Long Capacity,RefillRate;
    public TokenBucketServiceImpl(Long capacity,Long refillRate) {
        RefillRate = refillRate;
        Capacity = capacity;
        CurrentToken=new AtomicLong(capacity);
        lastRefillToken=new AtomicLong(System.currentTimeMillis());
    }
    @Override
    public void refillToken() {
        Long now=System.currentTimeMillis();
        Long timeElapsed=now-lastRefillToken.get();
        if(timeElapsed>0) {
            Long tokenToAdd=(timeElapsed*RefillRate)/1000;
            if(tokenToAdd>0) {
                CurrentToken.updateAndGet(current->Math.min(Capacity,current+tokenToAdd));
                lastRefillToken.set(now);
            }
        }
    }

    @Override
    public boolean tryConsumeToken() {
        refillToken();
        if(CurrentToken.get()>0) {
            CurrentToken.decrementAndGet();
            return true;
        }
        return false;
    }

    @Override
    public Long getCurrentToken() {
        refillToken();
        return CurrentToken.get();
    }
}
