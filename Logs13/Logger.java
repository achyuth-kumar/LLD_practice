public class Logger {
    public LogStrategy logStrategy;

    public Logger(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
    }
    public void logMessage(String message) {
        logStrategy.logMessage(message);
    }

}
