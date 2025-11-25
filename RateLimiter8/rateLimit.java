public interface rateLimit {
    public void refillToken();
    public boolean tryConsumeToken();
    public long getCurrentToken();
}
