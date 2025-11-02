public interface TokenBucket {
    public void RefillToken();
    public boolean TryConsumeBucket();
    public long GetCurrentToken();
}
