import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class TokenBucketServiceImpl implements TokenBucket{
    AtomicLong CurrentToken,lastRefillToken;
    Long Capacity,refillRate;
    public TokenBucketServiceImpl(Long capacity, Long refillRate) {
        this.Capacity = capacity;
        this.refillRate = refillRate;
        this.CurrentToken=new AtomicLong(Capacity);
        this.lastRefillToken=new AtomicLong(refillRate);
    }
    @Override
    public void refillTokens() {
        Long now=System.currentTimeMillis();
        Long timeElapsed=now-lastRefillToken.get();
        if(timeElapsed>0) {
            Long tokenToAdd=(timeElapsed*refillRate)/1000;
            if(tokenToAdd>0) {
                CurrentToken.updateAndGet(current->Math.min(Capacity,current+tokenToAdd));
                lastRefillToken.set(now);
            }
        }
    }

    @Override
    public boolean tryConsumeToken() {
        refillTokens();
        if(CurrentToken.get()>0) {
            CurrentToken.decrementAndGet();
            return true;
        }
        return false;
    }

    @Override
    public Long GetCurrentToken() {
        refillTokens();
        return CurrentToken.get();
    }
}
