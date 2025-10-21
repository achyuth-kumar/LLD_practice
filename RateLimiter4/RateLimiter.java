public interface RateLimiter {
    public void RefillTokens();
    public boolean TryConsumeBuckets();
    public long GetCurrentTokens();
}
