public class Logger {

    LogStrategy logStrategy;
    public Logger(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
    }
    public void log(String message) {
        logStrategy.logMessage(message);
    }
}
