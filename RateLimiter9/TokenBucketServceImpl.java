import java.util.concurrent.atomic.AtomicLong;

public class TokenBucketServceImpl implements TokenBucket{
    AtomicLong currentToken,lastRefillToken;
    Integer capacity,refillRate;
    public TokenBucketServceImpl(Integer capacity,Integer refillRate) {
        this.capacity = capacity;
        this.refillRate = refillRate;
        this.currentToken=new AtomicLong(capacity);
        this.lastRefillToken=new AtomicLong(System.currentTimeMillis());
    }

    @Override
    public void refillToken() {
        long now = System.currentTimeMillis();
        long timeElapsed=now-lastRefillToken.get();
        if(timeElapsed>0) {
            long tokenToAdd=(timeElapsed*refillRate)/1000;
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
    public long getCurrentToken() {
        return currentToken.get();
    }
}
