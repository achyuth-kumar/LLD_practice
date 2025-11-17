public interface TokenBucket {
    public void RefillTokens();
    public boolean TryConsumeBuckets();
    public long GetCurrentToken();
}
