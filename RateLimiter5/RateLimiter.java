public interface RateLimiter {
    public void RefillToken();
    public boolean TryConcumeBucket();
    public long GetCurrentToken();
}
