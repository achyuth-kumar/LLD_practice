public class LogServiceImpl {
    LogStrategy logStrategy;

    public LogServiceImpl(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
    }

    public void logMessage(String message) {
        logStrategy.logMessage(message);
    }

}
