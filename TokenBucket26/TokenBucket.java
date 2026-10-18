public interface TokenBucket {
    public boolean tryConsumeToken();
    public void refillToken();
    public Long getCurrentToken();
}
