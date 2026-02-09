public class LogServiceImpl {
    public LogStrategy logStrategy;
    public LogServiceImpl(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
    }
    public void log(String message) {
        logStrategy.logMessage(message);
    }
}
