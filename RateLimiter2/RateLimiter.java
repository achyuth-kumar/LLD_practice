public interface RateLimiter {
    public void RefillTokens();
    public long getCurrentTokens();
    public boolean tryConsumeBucket();
}
