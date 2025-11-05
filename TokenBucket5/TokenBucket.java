public interface TokenBucket {
    public void RefillTokens();
    public boolean TryConsumeBucket();
    public long GetCurrentToken();
}
