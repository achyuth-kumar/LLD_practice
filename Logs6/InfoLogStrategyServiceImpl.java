public class InfoLogStrategyServiceImpl implements LogStrategy {
    @Override
    public void logMessage(String message) {
        System.out.println(LogType.INFO+message);
    }
}
