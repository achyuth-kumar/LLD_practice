import java.util.concurrent.atomic.AtomicLong;

public class TokenBucketServiceImpl implements TokenBucket{
    AtomicLong currentToken,lastRefillToken;
    long capacity,refillRate;

    public TokenBucketServiceImpl(long capacity,long refillRate) {
        currentToken=new AtomicLong(capacity);
        lastRefillToken=new AtomicLong(System.currentTimeMillis());
        this.capacity=capacity;
        this.refillRate=refillRate;
    }


    @Override
    public void RefillTokens() {
        long now =System.currentTimeMillis();
        long timeElapsed=now-lastRefillToken.get();
        if(timeElapsed>0) {
            long tokensToAdd=(timeElapsed*refillRate)/1000;
            if(tokensToAdd>0) {
                currentToken.updateAndGet(current->Math.min(current,current+tokensToAdd));
                lastRefillToken.set(now);
            }
        }
    }

    @Override
    public boolean TryConsumeBuckets() {
        RefillTokens();
        if(currentToken.get()>0) {
            currentToken.decrementAndGet();
            return true;
        }
        return false;
    }

    @Override
    public long GetCurrentToken() {
        RefillTokens();
        return currentToken.get();
    }
}
