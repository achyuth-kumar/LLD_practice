public class ErrorLogStrategyServiceImpl implements LogStrategy {
    @Override
    public void logMessage(String message) {
        System.out.println(LogType.ERROR+message);
    }
}
