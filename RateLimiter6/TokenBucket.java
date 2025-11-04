public interface TokenBucket {
    public void RefillToken();
    public boolean TryConsumebucket();
    public Long GetCurrentToken();
}
