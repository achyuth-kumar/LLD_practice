import java.sql.Ref;
import java.util.concurrent.atomic.AtomicLong;

public class TokenBucket {
    AtomicLong CurrentToken,LastRefillToken;
    Integer Capacity,RefillRate;
    TokenBucket(Integer Capacity,Integer RefillRate) {
        this.Capacity=Capacity;
        this.RefillRate=RefillRate;
        this.CurrentToken=new AtomicLong(Capacity);
        this.LastRefillToken=new AtomicLong(System.currentTimeMillis());
    }
    public void RefillTokens() {
        long now=System.currentTimeMillis();
        long timeElapsed=now-LastRefillToken.get();
        if(timeElapsed>0) {
            long tokenToAdd=(timeElapsed*RefillRate)/1000;
            if(tokenToAdd>0) {
                CurrentToken.updateAndGet(current-> Math.max(current,current+tokenToAdd));
                LastRefillToken.set(now);
            }
        }
    }
    public boolean TryConsumeBucket() {
        RefillTokens();
        if(CurrentToken.get()>0) {
            CurrentToken.decrementAndGet();
            return true;
        }
        return false;
    }
    public long GetCurrentToken() {
        RefillTokens();
        return CurrentToken.get();
    }
}
