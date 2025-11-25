import java.util.concurrent.atomic.AtomicLong;

public class rateLimitServiceImpl implements rateLimit{
    AtomicLong currentToken,lastRefillToken;
    long capacity,refillRate;

    public rateLimitServiceImpl(long capacity, long refillRate) {
        this.capacity = capacity;
        this.refillRate = refillRate;
        currentToken=new AtomicLong(capacity);
        lastRefillToken=new AtomicLong(System.currentTimeMillis());
    }


    @Override
    public void refillToken() {
        long now=System.currentTimeMillis();
        long timeElapsed=now-lastRefillToken.get();
        if(timeElapsed>0) {
            long tokensToAdd=(timeElapsed*refillRate)/1000;
            currentToken.updateAndGet(current->Math.min(current,current+tokensToAdd));
            lastRefillToken.set(now);
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
        refillToken();
        return currentToken.get();
    }
}
