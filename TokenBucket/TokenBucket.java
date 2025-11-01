import java.util.concurrent.atomic.AtomicLong;

public class TokenBucket {
    AtomicLong CurrentToken,lastRefillToken;
    Integer Capacity,RefillRate;
    TokenBucket(Integer Capacity,Integer RefillRate) {
        this.Capacity=Capacity;
        this.RefillRate=RefillRate;
        CurrentToken=new AtomicLong(Capacity);
        lastRefillToken=new AtomicLong(System.currentTimeMillis());
    }
    public void RefillToken() {
        long now=System.currentTimeMillis();
        long timeElapsed=now-lastRefillToken.get();
        if(timeElapsed>0) {
            long tokensToAdd = (timeElapsed * RefillRate) / 1000;
            if(tokensToAdd>0) {
                CurrentToken.updateAndGet(Current -> Math.max(Current, tokensToAdd + Current));
                lastRefillToken.set(now);
            }
        }
    }
    public boolean TryConsumeBucket() {
        RefillToken();
        if(CurrentToken.get()>0) {
            CurrentToken.decrementAndGet();
            return true;
        }
        return false;
    }
    public long GetCurrentToken(){
        RefillToken();
        return CurrentToken.get();
    }
}
