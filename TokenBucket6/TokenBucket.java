public interface TokenBucket {
    public void refillTokens();
    public boolean tryConsumeToken();
    public Long GetCurrentToken();
}
