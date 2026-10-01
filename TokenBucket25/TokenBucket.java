public interface TokenBucket {
    public void refillToken();
    public boolean tryConsumeToken();
    public Long getCurrentToken();
}
