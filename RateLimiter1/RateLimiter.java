public interface RateLimiter {
    public void RefillTokens();
    public long GetCurrentTokens();
    public boolean TryConsumeToken();
}
