public interface RateLimiter {
    public boolean TryConsumeBucket();
    public void RefillTockens();
    public long GetCurrentTockens();
}
