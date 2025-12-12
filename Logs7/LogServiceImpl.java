public class LogServiceImpl {
    private LogStrategy logStrategy;

    public LogServiceImpl(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
    }
    public void log(String Message) {
        logStrategy.logMessage(Message);
    }

}
