import java.util.concurrent.atomic.AtomicLong;

public class TokenBucketServiceImpl implements  TokenBucket{
    AtomicLong currentToken,lastRefillToken;
    Long capacity,refillRate;


    public TokenBucketServiceImpl(Long capacity,Long refillRate) {
        this.refillRate = refillRate;
        this.capacity = capacity;
        this.currentToken=new AtomicLong(capacity);
        this.lastRefillToken=new AtomicLong(System.currentTimeMillis());
    }


    @Override
    public void refillToken() {
        Long now=System.currentTimeMillis();
        Long timeElapsed=now-lastRefillToken.get();
        if(timeElapsed>0) {
            Long tokenToAdd=(timeElapsed*refillRate)/1000;
            if(tokenToAdd>0) {
                currentToken.updateAndGet(current->Math.min(capacity,current+tokenToAdd));
                lastRefillToken.set(now);
            }
        }
    }

    @Override
    public boolean tryConsumeToken() {
        refillToken();
        if(currentToken.get()>0) {
            currentToken.decrementAndGet();
            return true;
        }
        return false;
    }

    @Override
    public Long getCurrentToken() {
        refillToken();
        return currentToken.get();
    }
}
